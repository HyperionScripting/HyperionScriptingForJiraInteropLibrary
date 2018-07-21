package hyperion.jira.interop.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Library {
    @XmlElement
    private String id;
    @XmlElement
    private String name;
    @XmlElement
    private String version;
    @XmlElement
    private String typeDefinitions;
    private VersionRange versionRange;

    public Library(String id, String name, String version, String typeDefinitions) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.typeDefinitions = typeDefinitions;
    }

    public Library(String id, String name, String version, String typeDefinitions, VersionRange versionRange) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.typeDefinitions = typeDefinitions;
        this.versionRange = versionRange;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTypeDefinitions() {
        return typeDefinitions;
    }

    public void setTypeDefinitions(String typeDefinitions) {
        this.typeDefinitions = typeDefinitions;
    }

    public VersionRange getVersionRange() {
        return versionRange;
    }

    public void setVersionRange(VersionRange versionRange) {
        this.versionRange = versionRange;
    }
}
