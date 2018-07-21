package hyperion.jira.interop.utils;

import hyperion.jira.interop.models.ResourceVersion;
import hyperion.jira.interop.models.ResourceVersionRange;
import hyperion.jira.interop.models.VersionRange;

import java.util.Collection;

public class VersionUtils {

    public static <T> ResourceVersionRange<T> getResource(Collection<ResourceVersionRange<T>> resources, ResourceVersion currentVersion) {
        for (ResourceVersionRange<T> resource : resources) {
            if (isInRange(resource, currentVersion)) {
                return resource;
            }
        }
        return null;
    }

    public static boolean isInRange(VersionRange versionRange, ResourceVersion comparableVersion) {
        int combinedStartVersion = Integer.parseInt(versionRange.getStartVersion().getMajorVersion() + "" + versionRange.getStartVersion().getMinorVersion());
        int endStartVersion = Integer.parseInt(versionRange.getEndVersion().getMajorVersion() + "" + versionRange.getEndVersion().getMinorVersion());
        int combinedCurrentVersion = Integer.parseInt(comparableVersion.getMajorVersion() + "" + comparableVersion.getMinorVersion());
        return combinedCurrentVersion >= combinedStartVersion && combinedCurrentVersion <= endStartVersion;
    }

}
