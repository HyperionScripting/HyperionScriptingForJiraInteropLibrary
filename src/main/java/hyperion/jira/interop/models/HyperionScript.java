package hyperion.jira.interop.models;

import javax.script.CompiledScript;
import javax.script.ScriptEngine;

public class HyperionScript {
    private ScriptEngine scriptEngine;
    private CompiledScript compiledScript;
    private String content;
    private Object parsedJSON;

    public HyperionScript(String content) {
        this.content = content;
    }

    public HyperionScript(ScriptEngine scriptEngine) {
        this.scriptEngine = scriptEngine;
    }

    public HyperionScript(ScriptEngine scriptEngine, CompiledScript compiledScript) {
        this.scriptEngine = scriptEngine;
        this.compiledScript = compiledScript;
    }

    public HyperionScript(String content, Object parsedJSON) {
        this.content = content;
        this.parsedJSON = parsedJSON;
    }

    public ScriptEngine getScriptEngine() {
        return scriptEngine;
    }

    public void setScriptEngine(ScriptEngine scriptEngine) {
        this.scriptEngine = scriptEngine;
    }

    public CompiledScript getCompiledScript() {
        return compiledScript;
    }

    public void setCompiledScript(CompiledScript compiledScript) {
        this.compiledScript = compiledScript;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getParsedJSON() {
        return parsedJSON;
    }

    public void setParsedJSON(Object parsedJSON) {
        this.parsedJSON = parsedJSON;
    }
}
