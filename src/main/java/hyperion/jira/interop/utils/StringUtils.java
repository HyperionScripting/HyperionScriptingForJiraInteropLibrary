package hyperion.jira.interop.utils;

public class StringUtils {
    public static String getResourceName(String resourceID) {
        String[] ids = resourceID.split("\\.");
        if (ids.length == 4) {
            return ids[3];
        } else if (ids.length == 5) {
            return ids[3]+"."+ids[4];
        }
        return null;
    }
}
