package hyperion.jira.interop.instrumentation;

import hyperion.jira.interop.exceptions.HandledException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement
public class Execution {
    private transient Logger logger;
    private int index;
    private String name;
    private String description;
    private String loggerPrefix;
    private String loggerName;
    private transient Class loggerClass;
    private long startTime = System.currentTimeMillis();
    private long endTime;
    private long executionTime;
    private boolean success;
    private List<LogEntry> logs = new LinkedList<>();
    private List<Execution> executions = new LinkedList<>();
    private transient DiagnosticsCollector diagnosticsCollector;

    public Execution() {
    }

    public Execution(DiagnosticsCollector diagnosticsCollector, String name, Logger logger, String loggerPrefix) {
        this.index = diagnosticsCollector.getNewLogCount();
        this.diagnosticsCollector = diagnosticsCollector;
        this.name = name;
        this.loggerPrefix = loggerPrefix;
        this.logger = logger;
    }

    public Execution(DiagnosticsCollector diagnosticsCollector, String name, Logger logger, String loggerPrefix, String description) {
        this.index = diagnosticsCollector.getNewLogCount();
        this.diagnosticsCollector = diagnosticsCollector;
        this.name = name;
        this.loggerPrefix = loggerPrefix;
        this.logger = logger;
        this.description = description;
    }

    public Execution(DiagnosticsCollector diagnosticsCollector, String name, Class loggerClass, String loggerPrefix) {
        this.index = diagnosticsCollector.getNewLogCount();
        this.diagnosticsCollector = diagnosticsCollector;
        this.name = name;
        this.loggerClass = loggerClass;
        this.loggerPrefix = loggerPrefix;
        this.logger = LoggerFactory.getLogger(loggerClass);
    }

    public Execution(DiagnosticsCollector diagnosticsCollector, String name, String loggerName, String loggerPrefix, String description) {
        this.index = diagnosticsCollector.getNewLogCount();
        this.diagnosticsCollector = diagnosticsCollector;
        this.name = name;
        this.loggerName = loggerName;
        this.loggerPrefix = loggerPrefix;
        this.description = description;
        this.logger = LoggerFactory.getLogger(loggerName);
    }

    public Execution(DiagnosticsCollector diagnosticsCollector, String name, Class loggerClass, String loggerPrefix, String description) {
        this.index = diagnosticsCollector.getNewLogCount();
        this.diagnosticsCollector = diagnosticsCollector;
        this.name = name;
        this.loggerClass = loggerClass;
        this.loggerPrefix = loggerPrefix;
        this.description = description;
        this.logger = LoggerFactory.getLogger(loggerClass);
    }

    public Execution newExecution(String name) {
        Execution execution = new Execution(this.diagnosticsCollector, name, logger, loggerPrefix);
        executions.add(execution);
        return execution;
    }

    public Execution newExecution(String name, String description) {
        Execution execution = new Execution(this.diagnosticsCollector, name, logger, loggerPrefix, description);
        executions.add(execution);
        return execution;
    }

    public Execution newExecution(String name, String description, String loggerName) {
        Execution execution = new Execution(this.diagnosticsCollector, name, loggerName, loggerPrefix, description);
        executions.add(execution);
        return execution;
    }

    public Execution newExecution(String name, String description, Class loggerClass) {
        Execution execution = new Execution(this.diagnosticsCollector, name, loggerClass, loggerPrefix, description);
        executions.add(execution);
        return execution;
    }

    public void success() {
        end();
        success = true;
    }

    public void fail() {
        end();
        success = false;
    }

    public void stopExecution() throws HandledException {
        fail();
        throw new HandledException();
    }

    public void stopExecution(Exception e) throws HandledException {
        fail();
        throw new HandledException(e);
    }

    public void stopExecution(String error) throws HandledException {
        fail();
        logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "ERROR", error));
        throw new HandledException(error);
    }

    private void end() {
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }

    public DiagnosticsCollector getDiagnosticsCollector() {
        return diagnosticsCollector;
    }

    public void trace(Object message) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "TRACE", message));
        } catch (Throwable e) {}
        logger.trace(getPrefix()+message);
    }

    public void trace(Object message, Throwable exception) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "TRACE", message, exception));
        } catch (Throwable e) {}
        logger.trace(getPrefix()+message, exception);
    }

    public void trace(Object message, Object exceptionMessage) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "TRACE", message, exceptionMessage.toString()));
        } catch (Throwable e) {}
        logger.trace(getPrefix()+message+" - Exception: "+exceptionMessage.toString());
    }

    public void debug(Object message) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "DEBUG", message));
        } catch (Throwable e) {}
        logger.debug(getPrefix()+message);
    }

    public void debug(Object message, Throwable exception) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "DEBUG", message, exception));
        } catch (Throwable e) {}
        logger.debug(getPrefix()+message, exception);
    }

    public void debug(Object message, Object exceptionMessage) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "DEBUG", message, exceptionMessage.toString()));
        } catch (Throwable e) {}
        logger.debug(getPrefix()+message+" - Exception: "+exceptionMessage.toString());
    }

    public void info(Object message) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "INFO", message));
        } catch (Throwable e) {}
        logger.info(getPrefix()+message);
    }

    public void info(Object message, Throwable exception) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "INFO", message, exception));
        } catch (Throwable e) {}
        logger.info(getPrefix()+message, exception);
    }

    public void info(Object message, Object exceptionMessage) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "INFO", message, exceptionMessage.toString()));
        } catch (Throwable e) {}
        logger.info(getPrefix()+message+" - Exception: "+exceptionMessage.toString());
    }

    public void warn(Object message) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "WARN", message));
        } catch (Throwable e) {}
        logger.warn(getPrefix()+message);
    }

    public void warn(Object message, Throwable exception) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "WARN", message, exception));
        } catch (Throwable e) {}
        logger.warn(getPrefix()+message, exception);
    }

    public void warn(Object message, Object exceptionMessage) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "WARN", message, exceptionMessage.toString()));
        } catch (Throwable e) {}
        logger.warn(getPrefix()+message+" - Exception: "+exceptionMessage.toString());
    }

    public void error(Object message) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "ERROR", message));
        } catch (Throwable e) {}
        logger.error(getPrefix()+message);
    }

    public void error(Object message, Throwable exception) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "ERROR", message, exception));
        } catch (Throwable e) {}
        logger.error(getPrefix()+message, exception);
    }

    public void error(Object message, Object exceptionMessage) {
        try {
            logs.add(new LogEntry(diagnosticsCollector.getNewLogCount(), getLoggerName(), "ERROR", message, exceptionMessage.toString()));
        } catch (Throwable e) {}
        logger.error(getPrefix()+message+" - Exception: "+exceptionMessage.toString());
    }

    public int getIndex() {
        return index;
    }

    private String getLoggerName() {
        if (loggerClass != null) {
            return loggerClass.getName();
        } else if (name != null) {
            return name;
        } else {
            return null;
        }
    }

    private String getPrefix() {
        if (loggerPrefix != null && loggerPrefix.trim().length() > 0) {
            return "["+loggerPrefix.trim()+"]["+diagnosticsCollector.getName()+"] ";
        } else {
            return "";
        }
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @XmlElementWrapper
    @XmlElement(name="executions")
    public List<Execution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<Execution> executions) {
        this.executions = executions;
    }

    public String getLoggerPrefix() {
        return loggerPrefix;
    }

    public void setLoggerPrefix(String loggerPrefix) {
        this.loggerPrefix = loggerPrefix;
    }

    @XmlElement
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    @XmlElement
    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @XmlElement
    public long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    @XmlElementWrapper
    @XmlElement(name="logs")
    public List<LogEntry> getLogs() {
        return logs;
    }

    public void setLogs(List<LogEntry> logs) {
        this.logs = logs;
    }
}
