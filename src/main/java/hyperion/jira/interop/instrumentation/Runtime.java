package hyperion.jira.interop.instrumentation;

public class Runtime {
    private Execution execution;
    private boolean liveTest;

    public Runtime(Execution execution, boolean liveTest) {
        this.execution = execution;
        this.liveTest = liveTest;
    }

    public Execution getExecution() {
        return execution;
    }

    public void setExecution(Execution execution) {
        this.execution = execution;
    }

    public boolean isLiveTest() {
        return liveTest;
    }

    public void setLiveTest(boolean liveTest) {
        this.liveTest = liveTest;
    }
}
