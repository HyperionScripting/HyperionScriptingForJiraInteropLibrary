package hyperion.jira.interop.models;

public class HyperionResource {
    private int id;
    private String name;
    private String resourceType;
    private String description;

    public HyperionResource(int id, String name, String resourceType, String description) {
        this.id = id;
        this.name = name;
        this.resourceType = resourceType;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
