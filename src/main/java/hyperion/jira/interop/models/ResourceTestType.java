package hyperion.jira.interop.models;

import hyperion.jira.interop.instrumentation.Execution;
import hyperion.jira.interop.managers.JSONManager;
import hyperion.jira.interop.managers.ScriptManager;
import hyperion.jira.interop.managers.TemplateManager;
import hyperion.jira.interop.services.contracts.LiveTestRunnerFunction;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

@XmlRootElement
public class ResourceTestType {
    @XmlElement
    private String id;
    @XmlElement
    private String name;
    @XmlElement
    private String sampleTestParams;
    @XmlElement
    private String sampleTestParamsSchema;
    private LiveTestRunnerFunction<ScriptManager, TemplateManager, JSONManager, Execution, Map<String, HyperionScript>, String, String, String, LiveTestRunResult> testRunner;


    public ResourceTestType() {
    }

    public ResourceTestType(String id, String name, LiveTestRunnerFunction<ScriptManager, TemplateManager, JSONManager, Execution, Map<String, HyperionScript>, String, String, String, LiveTestRunResult> testRunner) {
        this.id = id;
        this.name = name;
        this.testRunner = testRunner;
    }

    public ResourceTestType(String id, String name, String sampleTestParams, String sampleTestParamsSchema, LiveTestRunnerFunction<ScriptManager, TemplateManager, JSONManager, Execution, Map<String, HyperionScript>, String, String, String, LiveTestRunResult> testRunner) {
        this.id = id;
        this.name = name;
        this.sampleTestParams = sampleTestParams;
        this.sampleTestParamsSchema = sampleTestParamsSchema;
        this.testRunner = testRunner;
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

    public String getSampleTestParams() {
        return sampleTestParams;
    }

    public void setSampleTestParams(String sampleTestParams) {
        this.sampleTestParams = sampleTestParams;
    }

    public String getSampleTestParamsSchema() {
        return sampleTestParamsSchema;
    }

    public void setSampleTestParamsSchema(String sampleTestParamsSchema) {
        this.sampleTestParamsSchema = sampleTestParamsSchema;
    }

    public LiveTestRunnerFunction<ScriptManager, TemplateManager, JSONManager, Execution, Map<String, HyperionScript>, String, String, String, LiveTestRunResult> getTestRunner() {
        return testRunner;
    }
}
