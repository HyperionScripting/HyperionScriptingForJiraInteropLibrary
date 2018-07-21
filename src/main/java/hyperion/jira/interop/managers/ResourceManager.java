package hyperion.jira.interop.managers;

import hyperion.jira.interop.models.HyperionResource;
import hyperion.jira.interop.models.ResourceTemplate;

import java.util.List;

public interface ResourceManager {
    List<HyperionResource> getAllResources();
    List<HyperionResource> getResourcesForType(String resourceType);
    HyperionResource getResource(String name, String resourceType);
    List<HyperionResource> getResources(String name, String resourceType);
    List<ResourceTemplate> getResourceTemplates();
}
