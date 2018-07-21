package hyperion.jira.interop.services.contracts;

import hyperion.jira.interop.exceptions.HandledException;

@FunctionalInterface
public interface LiveTestRunnerFunction<One, Two, Three, Four, Five, Six, Seven, Eight, Nine> {
    Nine apply (One a, Two b, Three c, Four d, Five e, Six f, Seven g, Eight h) throws HandledException;
}
