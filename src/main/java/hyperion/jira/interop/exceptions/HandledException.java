package hyperion.jira.interop.exceptions;

public class HandledException extends Exception {

    public HandledException() {
    }

    public HandledException(Throwable throwable) {
        super(throwable);
    }

    public HandledException(String s) {
        super(s);
    }
}
