package hyperion.jira.interop.models;

import hyperion.jira.interop.configs.BaseConfig;
import hyperion.jira.interop.constants.ResourceEditorType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResourceEditor {
    @XmlElement
    private String id;
    @XmlElement
    private String name;
    @XmlElement
    private String definitions;
    @XmlElement
    private ResourceEditorType editorType;
    private Class<? extends BaseConfig> jsonConfigType;
    private boolean userJavaScriptJSONSerializer;

    public ResourceEditor(String id, String name, ResourceEditorType editorType) {
        this.id = id;
        this.name = name;
        this.editorType = editorType;
    }

    public ResourceEditor(String id, String name, String definitions, ResourceEditorType editorType) {
        this.id = id;
        this.name = name;
        this.definitions = definitions;
        this.editorType = editorType;
    }

    public ResourceEditor(String id, String name, String definitions, ResourceEditorType editorType, Class<? extends BaseConfig> jsonConfigType) {
        this.id = id;
        this.name = name;
        this.definitions = definitions;
        this.editorType = editorType;
        this.jsonConfigType = jsonConfigType;
    }

    public ResourceEditor(String id, String name, String definitions, ResourceEditorType editorType, boolean userJavaScriptJSONSerializer) {
        this.id = id;
        this.name = name;
        this.definitions = definitions;
        this.editorType = editorType;
        this.userJavaScriptJSONSerializer = userJavaScriptJSONSerializer;
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

    public String getDefinitions() {
        return definitions;
    }

    public void setDefinitions(String definitions) {
        this.definitions = definitions;
    }

    public ResourceEditorType getEditorType() {
        return editorType;
    }

    public void setEditorType(ResourceEditorType editorType) {
        this.editorType = editorType;
    }

    public Class<? extends BaseConfig> getJsonConfigType() {
        return jsonConfigType;
    }

    public void setJsonConfigType(Class<? extends BaseConfig> jsonConfigType) {
        this.jsonConfigType = jsonConfigType;
    }

    public boolean isUserJavaScriptJSONSerializer() {
        return userJavaScriptJSONSerializer;
    }

    public void setUserJavaScriptJSONSerializer(boolean userJavaScriptJSONSerializer) {
        this.userJavaScriptJSONSerializer = userJavaScriptJSONSerializer;
    }
}