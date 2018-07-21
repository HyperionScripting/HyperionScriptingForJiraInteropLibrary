package hyperion.jira.interop.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class ResourceTemplate {
    @XmlElement
    private String id;
    @XmlElement
    private String name;
    @XmlElement
    private String description;
    private AccessLevel accessLevel;
    private String resourceType;
    private VersionRange versionRange;
    @XmlElement
    private boolean example;
    @XmlElementWrapper
    @XmlElement(name="contents")
    private List<ResourceContent> contents;

    public ResourceTemplate(String id, String name, String description, AccessLevel accessLevel, List<ResourceContent> contents) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accessLevel = accessLevel;
        this.contents = contents;
    }

    public ResourceTemplate(String id, String name, String description, AccessLevel accessLevel, List<ResourceContent> contents, boolean example) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accessLevel = accessLevel;
        this.contents = contents;
        this.example = example;
    }

    public ResourceTemplate(String id, String name, String description, AccessLevel accessLevel, List<ResourceContent> contents, VersionRange versionRange) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accessLevel = accessLevel;
        this.contents = contents;
        this.versionRange = versionRange;
    }

    public ResourceTemplate(String id, String name, String description, AccessLevel accessLevel, List<ResourceContent> contents, VersionRange versionRange, boolean example) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accessLevel = accessLevel;
        this.contents = contents;
        this.versionRange = versionRange;
        this.example = example;
    }

    public ResourceTemplate(String id, String name, String description, AccessLevel accessLevel, String resourceType, List<ResourceContent> contents) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accessLevel = accessLevel;
        this.resourceType = resourceType;
        this.contents = contents;
    }

    public ResourceTemplate(String id, String name, String description, AccessLevel accessLevel, String resourceType, List<ResourceContent> contents, boolean example) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accessLevel = accessLevel;
        this.resourceType = resourceType;
        this.contents = contents;
        this.example = example;
    }

    public ResourceTemplate(String id, String name, String description, AccessLevel accessLevel, String resourceType, List<ResourceContent> contents, VersionRange versionRange) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accessLevel = accessLevel;
        this.resourceType = resourceType;
        this.contents = contents;
        this.versionRange = versionRange;
    }

    public ResourceTemplate(String id, String name, String description, AccessLevel accessLevel, String resourceType, List<ResourceContent> contents, VersionRange versionRange, boolean example) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accessLevel = accessLevel;
        this.resourceType = resourceType;
        this.contents = contents;
        this.versionRange = versionRange;
        this.example = example;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ResourceContent> getContents() {
        return contents;
    }

    public void setContents(List<ResourceContent> contents) {
        this.contents = contents;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public VersionRange getVersionRange() {
        return versionRange;
    }

    public void setVersionRange(VersionRange versionRange) {
        this.versionRange = versionRange;
    }

    public boolean isExample() {
        return example;
    }

    public void setExample(boolean example) {
        this.example = example;
    }

    public enum AccessLevel {
        EDITABLE_ONLY, RUNNABLE_ONLY, EDITABLE_AND_RUNNABLE
    }
}
