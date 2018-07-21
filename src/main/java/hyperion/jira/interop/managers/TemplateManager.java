package hyperion.jira.interop.managers;

import hyperion.jira.interop.models.HyperionScript;
import hyperion.jira.interop.models.ResourceID;
import hyperion.jira.interop.instrumentation.Runtime;

import java.util.Map;

public interface TemplateManager {
    String renderTemplate(ResourceID resourceID, String editor, Runtime runtime, String baseUrl, Map<String, Object> velocityParams);

    String renderTemplate(String resourceID, String editor, Runtime runtime, String baseUrl, Map<String, Object> velocityParams);

    String renderTemplate(String resourceID, String editor, HyperionScript script, Runtime runtime, String baseUrl, Map<String, Object> velocityParams);

    String renderTemplate(String resourceID, String view, String content, String baseUrl, Map<String, Object> velocityParams);
}