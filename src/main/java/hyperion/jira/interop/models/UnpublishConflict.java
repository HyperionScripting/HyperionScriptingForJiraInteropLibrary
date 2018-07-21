package hyperion.jira.interop.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class UnpublishConflict {
    @XmlElement
    private String entityName;
    @XmlElementWrapper
    @XmlElement(name="configuredObjects")
    private List<String> configuredObjects = new ArrayList<>();

    public UnpublishConflict(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public List<String> getConfiguredObjects() {
        return configuredObjects;
    }

    public void setConfiguredObjects(List<String> configuredObjects) {
        this.configuredObjects = configuredObjects;
    }
}