package hyperion.jira.interop.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class LiveTestRunResult {
    private String output;
    private boolean html;
    private List<String> webResources;
    private List<String> webResourcesForContext;

    public LiveTestRunResult() {
    }

    public LiveTestRunResult(String output) {
        this.output = output;
    }

    public LiveTestRunResult(String output, boolean html) {
        this.output = output;
        this.html = html;
    }

    public LiveTestRunResult(String output, boolean html, List<String> webResources, List<String> webResourcesForContext) {
        this.output = output;
        this.html = html;
        this.webResources = webResources;
        this.webResourcesForContext = webResourcesForContext;
    }

    @XmlElement
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @XmlElement
    public boolean isHtml() {
        return html;
    }

    public void setHtml(boolean html) {
        this.html = html;
    }

    public List<String> getWebResources() {
        return webResources;
    }

    public void setWebResources(List<String> webResources) {
        this.webResources = webResources;
    }

    public List<String> getWebResourcesForContext() {
        return webResourcesForContext;
    }

    public void setWebResourcesForContext(List<String> webResourcesForContext) {
        this.webResourcesForContext = webResourcesForContext;
    }
}
