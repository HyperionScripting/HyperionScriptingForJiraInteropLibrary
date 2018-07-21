package hyperion.jira.interop.managers;

import hyperion.jira.interop.instrumentation.DiagnosticsCollector;

public interface InstrumentationManager {
    void storeDiagnostics(DiagnosticsCollector diagnostics);
}
