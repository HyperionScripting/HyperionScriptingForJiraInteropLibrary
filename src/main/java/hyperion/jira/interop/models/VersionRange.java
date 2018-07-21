package hyperion.jira.interop.models;

public class VersionRange {
    private ResourceVersion startVersion;
    private ResourceVersion endVersion;

    public VersionRange(ResourceVersion startVersion, ResourceVersion endVersion) {
        this.startVersion = startVersion;
        this.endVersion = endVersion;
    }

    public ResourceVersion getStartVersion() {
        return startVersion;
    }

    public void setStartVersion(ResourceVersion startVersion) {
        this.startVersion = startVersion;
    }

    public ResourceVersion getEndVersion() {
        return endVersion;
    }

    public void setEndVersion(ResourceVersion endVersion) {
        this.endVersion = endVersion;
    }
}
