package hyperion.jira.interop.utils;

public class ExceptionUtils {
    public static String formatException(Throwable e) {
        try {
            String exception = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(e);
            String[] lines = exception.split("\n");
            for (String line : lines) {
                if (line.startsWith("Caused by: <eval>:")) {
                    line = line.replace("Caused by: <eval>:", "");
                    String lineNumber = line.substring(0, line.indexOf(" "));
                    String reason = line.substring(line.indexOf(" ") + 1, line.length());
                    return "JavaScript error in line " + lineNumber + ": " + reason + ". In script editor open More Action > Preview & Publish to see the corresponding code in line " + lineNumber + ".\nOriginal Exception: " + exception;
                }
            }
            return exception;
        } catch (Throwable ex) {
            return org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(e);
        }
    }
}