package hyperion.jira.interop.instrumentation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LogEntry {
    private int index;
    private long time;
    private String name;
    private String level;
    private String message;
    private String exceptionMessage;
    private transient Throwable exception;

    public LogEntry() {
        this.time = System.currentTimeMillis();
    }

    public LogEntry(int index, String name, String level, Object message) {
        this.index = index;
        this.time = System.currentTimeMillis();
        this.name = name;
        this.level = level;
        setMessage(message);
    }

    public LogEntry(int index, String name, String level, Object message, String exceptionMessage) {
        this.index = index;
        this.time = System.currentTimeMillis();
        this.name = name;
        this.level = level;
        this.exceptionMessage = exceptionMessage;
        setMessage(message);
    }

    public LogEntry(int index, String name, String level, Object message, Throwable exception) {
        this.index = index;
        this.time = System.currentTimeMillis();
        this.name = name;
        this.level = level;
        this.exception = exception;
        setMessage(message);
    }

    public int getIndex() {
        return index;
    }

    @XmlElement
    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @XmlElement
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @XmlElement
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    private void setMessage(Object message) {
        if (message != null) {
            this.message = message.toString();
        } else {
            this.message = "null";
        }
    }
}
