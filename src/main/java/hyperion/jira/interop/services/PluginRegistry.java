package hyperion.jira.interop.services;

import hyperion.jira.interop.models.*;

import java.util.List;

public interface PluginRegistry {
    String getName();
    String getId();
    String getScriptRootContextTypeScript() throws Exception;
    Object getTemplateContext();
    List<ScriptContext> getScriptContexts() throws Exception;
    List<ResourceType> getResourceTypes() throws Exception;
    List<ResourceTemplate> getTemplates() throws Exception;
    List<Library> getLibraries() throws Exception;
    List<UnpublishConflict> getUnpublishConflicts(String resourceID);
    void resourcePublished(String resourceID);
    void resourceUnpublished(String resourceID);

    default int getVersion() {
        return 1;
    }
}