package hyperion.jira.interop.constants;

public class HyperionCombinedResourceID {
    public static class PostFunction {
        public static final String DEFAULT = String.format("%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.PostFunction.ID, HyperionResourceID.PostFunction.SubType.DEFAULT);
    }

    public static class Condition {
        public static final String DEFAULT = String.format("%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.Condition.ID, HyperionResourceID.Condition.SubType.DEFAULT);
    }

    public static class Validator {
        public static final String DEFAULT = String.format("%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.Validator.ID, HyperionResourceID.Validator.SubType.DEFAULT);
    }

    public static class Listener {
        public static final String DEFAULT = String.format("%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.Listener.ID, HyperionResourceID.Listener.SubType.DEFAULT);
    }

    public static class Job {
        public static final String DEFAULT = String.format("%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.Job.ID, HyperionResourceID.Job.SubType.DEFAULT);
    }

    public static class HttpEndpoint {
        public static final String DEFAULT = String.format("%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.HttpEndpoint.ID, HyperionResourceID.HttpEndpoint.SubType.DEFAULT);
    }

    public static class AdminScript {
        public static final String DEFAULT = String.format("%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.AdminScript.ID, HyperionResourceID.AdminScript.SubType.DEFAULT);
    }

    public static class SharedScript {
        public static final String JQL_UTILS = String.format("%s.%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.SharedScript.ID, HyperionResourceID.SharedScript.SubType.DEFAULT, HyperionResourceID.SharedScript.Template.JQL_UTILS);
        public static final String REST_ENDPOINT_UTILS = String.format("%s.%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.SharedScript.ID, HyperionResourceID.SharedScript.SubType.DEFAULT, HyperionResourceID.SharedScript.Template.REST_ENDPOINT_UTILS);
        public static final String REST_HTTP_CLIENT = String.format("%s.%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.SharedScript.ID, HyperionResourceID.SharedScript.SubType.DEFAULT, HyperionResourceID.SharedScript.Template.REST_HTTP_CLIENT);
    }

    public static class SharedTemplate {
        public static final String JIRA_EVENT_MAIL_NOTIFICATION_TEMPLATE = String.format("%s.%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.SharedTemplate.ID, HyperionResourceID.SharedTemplate.SubType.DEFAULT, HyperionResourceID.SharedTemplate.Template.JIRA_EVENT_MAIL_NOTIFICATION_TEMPLATE);
        public static final String RECENT_ISSUE_UPDATES_NOTIFICATION_TEMPLATE = String.format("%s.%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.SharedTemplate.ID, HyperionResourceID.SharedTemplate.SubType.DEFAULT, HyperionResourceID.SharedTemplate.Template.RECENT_ISSUE_UPDATES_NOTIFICATION_TEMPLATE);
        public static final String LIST_OF_SCHEDULED_JOBS_TEMPLATE = String.format("%s.%s.%s.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.SharedTemplate.ID, HyperionResourceID.SharedTemplate.SubType.DEFAULT, HyperionResourceID.SharedTemplate.Template.LIST_OF_SCHEDULED_JOBS_TEMPLATE);
    }

    public static class Library {
        public static final String HTTP_CLIENT = String.format("%s.Library.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.Library.Template.HTTP_CLIENT);
        public static final String COMMONS_LANG3 = String.format("%s.Library.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.Library.Template.COMMONS_LANG3);
        public static final String COMMONS_IO = String.format("%s.Library.%s", HyperionResourceID.PLUGIN_ID, HyperionResourceID.Library.Template.COMMONS_IO);
    }
}
