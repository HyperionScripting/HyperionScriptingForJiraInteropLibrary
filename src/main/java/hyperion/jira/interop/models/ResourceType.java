package hyperion.jira.interop.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.function.Consumer;

@XmlRootElement
public class ResourceType {
    @XmlElement
    private String id;
    @XmlElement
    private String name;
    @XmlElement
    private String namePlural;
    @XmlElement
    private String description;
    @XmlElement
    private String infoUrl;
    @XmlElementWrapper
    @XmlElement(name="subTypes")
    private List<ResourceSubType> subTypes;

    public ResourceType(String id, String name, String namePlural, String description, List<ResourceSubType> subTypes) {
        this.id = id;
        this.name = name;
        this.namePlural = namePlural;
        this.description = description;
        this.subTypes = subTypes;
    }

    public ResourceType(String id, String name, String namePlural, String description, String infoUrl, List<ResourceSubType> subTypes) {
        this.id = id;
        this.name = name;
        this.namePlural = namePlural;
        this.description = description;
        this.infoUrl = infoUrl;
        this.subTypes = subTypes;
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

    public String getNamePlural() {
        return namePlural;
    }

    public void setNamePlural(String namePlural) {
        this.namePlural = namePlural;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public List<ResourceSubType> getSubTypes() {
        return subTypes;
    }

    public void setSubTypes(List<ResourceSubType> subTypes) {
        this.subTypes = subTypes;
    }
}