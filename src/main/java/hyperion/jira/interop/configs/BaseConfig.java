package hyperion.jira.interop.configs;

public class BaseConfig {
    private boolean sharedGlobalScope;

    public boolean isSharedGlobalScope() {
        return sharedGlobalScope;
    }

    public void setSharedGlobalScope(boolean sharedGlobalScope) {
        this.sharedGlobalScope = sharedGlobalScope;
    }
}
