package hyperion.jira.interop.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

@XmlRootElement
public class ResourceSubType {
    @XmlElement
    private String id;
    @XmlElement
    private String name;
    @XmlElement
    private String description;
    @XmlElementWrapper
    @XmlElement(name="editors")
    private List<ResourceEditor> editors = new ArrayList<>();
    @XmlElementWrapper
    @XmlElement(name="templates")
    private List<ResourceTemplate> templates = new LinkedList<>();
    @XmlElementWrapper
    @XmlElement(name="testTypes")
    private List<ResourceTestType> testTypes = new ArrayList<>();

    public ResourceSubType(String id, String name, String description, List<ResourceEditor> editors, List<ResourceTemplate> templates) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.editors = editors;
        this.templates = templates;
    }

    public ResourceSubType(String id, String name, String description, List<ResourceEditor> editors, List<ResourceTemplate> templates, List<ResourceTestType> testTypes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.editors = editors;
        this.templates = templates;
        this.testTypes = testTypes;
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

    public List<ResourceEditor> getEditors() {
        return editors;
    }

    public void setEditors(List<ResourceEditor> editors) {
        this.editors = editors;
    }

    public List<ResourceTemplate> getTemplates() {
        return templates;
    }

    public void setTemplates(List<ResourceTemplate> templates) {
        this.templates = templates;
    }

    public List<ResourceTestType> getTestTypes() {
        return testTypes;
    }

    public void setTestTypes(List<ResourceTestType> testTypes) {
        this.testTypes = testTypes;
    }
}
