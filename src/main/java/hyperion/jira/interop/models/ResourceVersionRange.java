package hyperion.jira.interop.models;

public class ResourceVersionRange<T> extends VersionRange {
    private T container;

    public ResourceVersionRange(ResourceVersion startVersion, ResourceVersion endVersion, T container) {
        super(startVersion, endVersion);
        this.container = container;
    }

    public T getContainer() {
        return container;
    }
}
