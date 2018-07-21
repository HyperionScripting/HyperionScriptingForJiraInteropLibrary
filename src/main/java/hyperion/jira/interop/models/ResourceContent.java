package hyperion.jira.interop.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class ResourceContent {
    @XmlElement
    private String editorId;
    @XmlElement
    private String content;
    private String compiledContent;
    @XmlElementWrapper
    @XmlElement(name="contents")
    private List<String> includes;

    public ResourceContent(String editorId, String content) {
        this.editorId = editorId;
        this.content = content;
    }

    public ResourceContent(String editorId, String content, List<String> includes) {
        this.editorId = editorId;
        this.content = content;
        this.includes = includes;
    }

    public ResourceContent(String editorId, String content, String compiledContent) {
        this.editorId = editorId;
        this.content = content;
        this.compiledContent = compiledContent;
    }

    public ResourceContent(String editorId, String content, String compiledContent, List<String> includes) {
        this.editorId = editorId;
        this.content = content;
        this.compiledContent = compiledContent;
        this.includes = includes;
    }

    public String getEditorId() {
        return editorId;
    }

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCompiledContent() {
        return compiledContent;
    }

    public void setCompiledContent(String compiledContent) {
        this.compiledContent = compiledContent;
    }

    public List<String> getIncludes() {
        return includes;
    }

    public void setIncludes(List<String> includes) {
        this.includes = includes;
    }
}
