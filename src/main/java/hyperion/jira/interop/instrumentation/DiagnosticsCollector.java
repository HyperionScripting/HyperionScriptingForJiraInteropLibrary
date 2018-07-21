package hyperion.jira.interop.instrumentation;

import hyperion.jira.interop.managers.JSONManager;
import hyperion.jira.interop.utils.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

@XmlRootElement
public class DiagnosticsCollector {
    private static transient final Logger logger = LoggerFactory.getLogger(DiagnosticsCollector.class);
    private int ID;
    private String name;
    private String action;
    private String user;
    private String ip;
    private String userAgent;
    private String nodeId;
    private String origin;
    private transient Supplier<String> getUserNameFunction;
    private transient Supplier<String> getIPFunction;
    private transient Supplier<String> getUserAgentFunction;
    private transient Supplier<String> getNodeIDFunction;
    private String loggerPrefix;
    private String serializedParams;
    private transient Object params;
    private long startTime = System.currentTimeMillis();
    private long endTime;
    private long executionTime;
    private boolean success;
    private boolean preQueueDone;
    private boolean preStorageDone;
    private List<Execution> executions = new LinkedList<>();
    private AtomicInteger logCounter = new AtomicInteger();

    public DiagnosticsCollector() {
    }

    public DiagnosticsCollector(String name, Object params) {
        this.name = name;
        this.params = params;
    }

    public DiagnosticsCollector(String name, Object params, String action) {
        this.name = name;
        this.params = params;
        this.action = action;
    }

    public DiagnosticsCollector(String name, Object params, String action, String loggerPrefix) {
        this.name = name;
        this.params = params;
        this.action = action;
        this.loggerPrefix = loggerPrefix;
    }

    public DiagnosticsCollector(String name, Object params, String action, String loggerPrefix, String user) {
        this.name = name;
        this.params = params;
        this.action = action;
        this.loggerPrefix = loggerPrefix;
        this.user = user;
    }

    public DiagnosticsCollector(String name, Object params, String action, String loggerPrefix, String user, String ip) {
        this.name = name;
        this.params = params;
        this.action = action;
        this.loggerPrefix = loggerPrefix;
        this.user = user;
        this.ip = ip;
    }

    public DiagnosticsCollector(String name, Object params, String action, String loggerPrefix, String user, String ip, String userAgent) {
        this.name = name;
        this.params = params;
        this.action = action;
        this.loggerPrefix = loggerPrefix;
        this.user = user;
        this.ip = ip;
        this.userAgent = userAgent;
    }

    public DiagnosticsCollector(String name, Object params, String action, String loggerPrefix, Supplier<String> getUserNameFunction) {
        this.name = name;
        this.params = params;
        this.action = action;
        this.loggerPrefix = loggerPrefix;
        this.getUserNameFunction = getUserNameFunction;
    }

    public DiagnosticsCollector(String name, Object params, String action, String loggerPrefix, Supplier<String> getUserNameFunction, Supplier<String> getIPFunction) {
        this.name = name;
        this.params = params;
        this.action = action;
        this.loggerPrefix = loggerPrefix;
        this.getUserNameFunction = getUserNameFunction;
        this.getIPFunction = getIPFunction;
    }

    public DiagnosticsCollector(String name, Object params, String action, String loggerPrefix, Supplier<String> getUserNameFunction, Supplier<String> getIPFunction, Supplier<String> getUserAgentFunction) {
        this.name = name;
        this.params = params;
        this.action = action;
        this.loggerPrefix = loggerPrefix;
        this.getUserNameFunction = getUserNameFunction;
        this.getIPFunction = getIPFunction;
        this.getUserAgentFunction = getUserAgentFunction;
    }

    public DiagnosticsCollector(String name, Object params, String action, String loggerPrefix, Supplier<String> getUserNameFunction, Supplier<String> getIPFunction, Supplier<String> getUserAgentFunction, Supplier<String> getNodeIDFunction) {
        this.name = name;
        this.params = params;
        this.action = action;
        this.loggerPrefix = loggerPrefix;
        this.getUserNameFunction = getUserNameFunction;
        this.getIPFunction = getIPFunction;
        this.getUserAgentFunction = getUserAgentFunction;
        this.getNodeIDFunction = getNodeIDFunction;
    }

    public DiagnosticsCollector(String name, Object params, String action, String loggerPrefix, Supplier<String> getUserNameFunction, Supplier<String> getIPFunction, Supplier<String> getUserAgentFunction, Supplier<String> getNodeIDFunction, String origin) {
        this.name = name;
        this.params = params;
        this.action = action;
        this.loggerPrefix = loggerPrefix;
        this.getUserNameFunction = getUserNameFunction;
        this.getIPFunction = getIPFunction;
        this.getUserAgentFunction = getUserAgentFunction;
        this.origin = origin;
        this.getNodeIDFunction = getNodeIDFunction;
    }

    public Execution newExecution(String name) {
        Execution execution = new Execution(this, name, logger, loggerPrefix);
        executions.add(execution);
        return execution;
    }

    public Execution newExecution(String name, String description) {
        Execution execution = new Execution(this, name, logger, loggerPrefix, description);
        executions.add(execution);
        return execution;
    }

    public Execution newExecution(String name, Class loggerClass) {
        Execution execution = new Execution(this, name, loggerClass, loggerPrefix);
        executions.add(execution);
        return execution;
    }

    public Execution newExecution(String name, String description, String loggerName) {
        Execution execution = new Execution(this, name, loggerName, loggerPrefix, description);
        executions.add(execution);
        return execution;
    }

    public Execution newExecution(String name, String description, Class loggerClass) {
        Execution execution = new Execution(this, name, loggerClass, loggerPrefix, description);
        executions.add(execution);
        return execution;
    }

    public void success() {
        end();
        success = true;
    }

    public void fail() {
        end();
        this.success = false;
    }

    public void runPreQueueOperations() {
        if (!preQueueDone) {
            preQueueDone = true;
            try {
                if (getUserNameFunction != null) {
                    this.user = getUserNameFunction.get();
                }
            } catch (Exception e) {
                logger.error("[Hyperion] Failed to retrieve user name for diagnostics collector", e);
            }
            try {
                if (getIPFunction != null) {
                    this.ip = getIPFunction.get();
                }
            } catch (Exception e) {
                logger.error("[Hyperion] Failed to retrieve user's IP for diagnostics collector", e);
            }
            try {
                if (getUserAgentFunction != null) {
                    this.userAgent = getUserAgentFunction.get();
                }
            } catch (Exception e) {
                logger.error("[Hyperion] Failed to retrieve user agent for diagnostics collector", e);
            }
            try {
                if (getNodeIDFunction != null) {
                    this.nodeId = getNodeIDFunction.get();
                }
            } catch (Exception e) {
                logger.error("[Hyperion] Failed to retrieve node ID for diagnostics collector", e);
            }
        }
    }

    public void runPreStorageOperations(JSONManager jsonManager) {
        if (!preStorageDone) {
            preStorageDone = true;
            try {
                if (params != null) {
                    this.serializedParams = jsonManager.toJSON(params);
                }
            } catch (Exception e) {
                logger.error("[Hyperion] Failed to serialized params for diagnostics collector", e);
            }
            for (Execution execution : getExecutions()) {
                finalizeExecution(execution);
            }
        }
    }

    private void finalizeExecution(Execution execution) {
        for (LogEntry log : execution.getLogs()) {
            try {
                if (log.getException() != null) {
                    log.setExceptionMessage(ExceptionUtils.formatException(log.getException()));
                }
            } catch (Exception e) {
                logger.error("[Hyperion] Failed to format exception for log entry", e);
            }
        }
        for (Execution exec : execution.getExecutions()) {
            finalizeExecution(exec);
        }
    }

    private void end() {
        endTime = System.currentTimeMillis();
        executionTime =  endTime - startTime;
    }

    @XmlElement
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @XmlElement
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
    @XmlElement(name="executions")
    public List<Execution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<Execution> executions) {
        this.executions = executions;
    }

    @XmlElement
    public String getSerializedParams() {
        return serializedParams;
    }

    public void setSerializedParams(String serializedParams) {
        this.serializedParams = serializedParams;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    @XmlElement
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @XmlElement
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @XmlElement
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @XmlElement
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @XmlElement
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public int getNewLogCount() {
        return logCounter.incrementAndGet();
    }
}
