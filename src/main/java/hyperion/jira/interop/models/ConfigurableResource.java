package hyperion.jira.interop.models;

public class ConfigurableResource {
    private String name;
    private String resource;
    private boolean runnable;

    public ConfigurableResource(String name, String resource) {
        this.name = name;
        this.resource = resource;
    }

    public ConfigurableResource(String name, String resource, boolean runnable) {
        this.name = name;
        this.resource = resource;
        this.runnable = runnable;
    }

    public String getName() {
        return name;
    }

    public String getResource() {
        return resource;
    }

    public boolean isRunnable() {
        return runnable;
    }
}
