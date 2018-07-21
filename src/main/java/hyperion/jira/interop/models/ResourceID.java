package hyperion.jira.interop.models;

public class ResourceID {
    private String pluginId;
    private String resourceTypeId;
    private String resourceSubTypeId;
    private String resourceName;
    private boolean runnable;

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public String getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public String getResourceSubTypeId() {
        return resourceSubTypeId;
    }

    public void setResourceSubTypeId(String resourceSubTypeId) {
        this.resourceSubTypeId = resourceSubTypeId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public boolean isRunnable() {
        return runnable;
    }

    public void setRunnable(boolean runnable) {
        this.runnable = runnable;
    }

    @Override
    public String toString() {
        if (!runnable) {
            return pluginId + "." + resourceTypeId + "." + resourceSubTypeId + "." + resourceName;
        } else {
            return pluginId + "." + resourceTypeId + "." + resourceSubTypeId + "." + resourceName+".Runnable";
        }
    }
}
