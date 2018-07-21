package hyperion.jira.interop.utils;

import hyperion.jira.interop.models.ResourceID;

import java.util.regex.Pattern;

public class ResourceUtils {
    public static String getID(String pluginId, String resourceTypeId) {
        return getID(pluginId, resourceTypeId, null);
    }

    public static String getID(String pluginId, String resourceTypeId, String resourceSubTypeId) {
        if (resourceSubTypeId == null) {
            resourceSubTypeId = "Default";
        }
        return pluginId + "." + resourceTypeId + "." + resourceSubTypeId;
    }

    public static String getID(String pluginId, String resourceTypeId, String resourceSubTypeId, String resourceName) {
        if (resourceSubTypeId == null) {
            resourceSubTypeId = "Default";
        }
        return pluginId + "." + resourceTypeId + "." + resourceSubTypeId + "." + resourceName;
    }

    public static String getIDFromNameAndType(String scriptName, String resourceType) {
        return resourceType+"."+scriptName;
    }

    public static ResourceID buildID(String id) {
        String[] ids = id.split(Pattern.quote("."));
        ResourceID resourceID = new ResourceID();
        for (int i = 0; i < ids.length; i++) {
            switch (i) {
                case 0:
                    resourceID.setPluginId(ids[i]);
                    break;
                case 1:
                    resourceID.setResourceTypeId(ids[i]);
                    break;
                case 2:
                    resourceID.setResourceSubTypeId(ids[i]);
                    break;
                case 3:
                    resourceID.setResourceName(ids[i]);
                    break;
                case 4:
                    if (ids[i].equals("Runnable")) {
                        resourceID.setRunnable(true);
                    }
                    break;
            }
        }
        return resourceID;
    }
}