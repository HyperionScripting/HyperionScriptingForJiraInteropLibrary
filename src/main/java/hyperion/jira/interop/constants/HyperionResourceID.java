package hyperion.jira.interop.constants;

public class HyperionResourceID {
    public static final String PLUGIN_ID = "Hyperion";

    public static class CustomField {
        public static final String ID = "CustomField";
        public static class SubType {
            public static final String CALCULATED_SINGLE_USER = "CalculatedSingleUser";
            public static final String CALCULATED_MULTI_USER = "CalculatedMultiUser";
            public static final String CALCULATED_SINGLE_VERSION = "CalculatedSingleVersion";
            public static final String CALCULATED_MULTI_VERSION = "CalculatedMultiVersion";
            public static final String CALCULATED_SINGLE_GROUP = "CalculatedSingleGroup";
            public static final String CALCULATED_MULTI_GROUP = "CalculatedMultiGroup";
            public static final String CALCULATED_SINGLE_PROJECT = "CalculatedSingleProject";
            public static final String CALCULATED_TEXT = "CalculatedText";
            public static final String CALCULATED_NUMBER = "CalculatedNumber";
            public static final String CALCULATED_DATE = "CalculatedDate";
            public static final String CALCULATED_DATE_TIME = "CalculatedDateTime";
        }
        public static class Template {
            public static final String DATE_TIME_OF_STATUS_CHANGE = "DateTimeOfStatusChange";
            public static final String ASSIGNEES_OF_OPEN_SUB_TASKS = "AssigneesOfOpenSubTasks";
        }
    }

    public static class PostFunction {
        public static final String ID = "PostFunction";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
        public static class Template {
            public static final String CREATE_ISSUE_LINK_BASED_ON_JQL = "CreateIssueLinkBasedOnJQL";
        }
    }

    public static class Condition {
        public static final String ID = "Condition";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
        public static class Template {
            public static final String SUB_TASKS_IN_ALLOWED_STATUSES = "SubTasksInAllowedStatuses";
        }
    }

    public static class Validator {
        public static final String ID = "Validator";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
        public static class Template {
            public static final String DESCRIPTION_CONTAINS_PHRASE = "DescriptionContainsPhrase";
        }
    }

    public static class Listener {
        public static final String ID = "Listener";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
        public static class Template {
            public static final String JIRA_EVENT_MAIL_NOTIFICATION = "JiraEventMailNotification";
        }
    }

    public static class Job {
        public static final String ID = "Job";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
        public static class Template {
            public static final String RECENT_ISSUE_UPDATES_MAIL_NOTIFICATION = "RecentIssueUpdatesMailNotification";
        }
    }

    public static class HttpEndpoint {
        public static final String ID = "HttpEndpoint";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
        public static class Template {
            public static final String DUMMY_REST_ENDPOINT = "DummyRestEndpoint";
            public static final String LIST_OF_SCHEDULED_JOBS = "ListOfScheduledJobs";
        }
    }

    public static class AdminScript {
        public static final String ID = "AdminScript";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
        public static class Template {
            public static final String TEST_DUMMY_REST_ENDPOINT = "TestDummyRestEndpoint";
            public static final String BULK_SCRIPT_RUNNER = "BulkScriptRunner";
        }
    }

    public static class SharedScript {
        public static final String ID = "SharedScript";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
        public static class Template {
            public static final String JQL_UTILS = "JQLUtils";
            public static final String REST_ENDPOINT_UTILS = "RestEndpointUtils";
            public static final String REST_HTTP_CLIENT = "RestHttpClient";
            public static final String HTTP_CLIENT_LIBRARY = "HttpClientLibrary";
            public static final String COMMONS_LANG3_LIBRARY = "CommonsLang3Library";
            public static final String COMMONS_IO_LIBRARY = "CommonsIOLibrary";
        }
    }

    public static class SharedTemplate {
        public static final String ID = "SharedTemplate";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
        public static class Template {
            public static final String JIRA_EVENT_MAIL_NOTIFICATION_TEMPLATE = "JiraEventMailNotificationTemplate";
            public static final String RECENT_ISSUE_UPDATES_NOTIFICATION_TEMPLATE = "RecentIssueUpdatesNotificationTemplate";
            public static final String LIST_OF_SCHEDULED_JOBS_TEMPLATE = "ListOfScheduledJobsTemplate";
        }
    }

    public static class SharedConfig {
        public static final String ID = "SharedConfig";
        public static class SubType {
            public static final String DEFAULT = "Default";
        }
    }

    public static class Library {
        public static final String ID = "Library";
        public static final class Template {
            public static final String HTTP_CLIENT= "HttpClient";
            public static final String COMMONS_LANG3 = "CommonsLang3";
            public static final String COMMONS_IO = "CommonsIO";
        }
    }
}