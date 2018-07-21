package hyperion.jira.interop.models;

public class ScriptContext {
    private String name;
    private Object context;
    private String typeDefinitions;

    public ScriptContext(String name, Object context, String typeDefinitions) {
        this.name = name;
        this.context = context;
        this.typeDefinitions = typeDefinitions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getContext() {
        return context;
    }

    public void setContext(Object context) {
        this.context = context;
    }

    public String getTypeDefinitions() {
        return typeDefinitions;
    }

    public void setTypeDefinitions(String typeDefinitions) {
        this.typeDefinitions = typeDefinitions;
    }
}
