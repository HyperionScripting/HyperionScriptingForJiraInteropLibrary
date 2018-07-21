package hyperion.jira.interop.managers;

import hyperion.jira.interop.models.HyperionScript;
import hyperion.jira.interop.models.ResourceID;
import hyperion.jira.interop.instrumentation.Runtime;

import javax.script.ScriptException;
import java.lang.reflect.InvocationTargetException;

public interface ScriptManager {
    Object fromJava(Iterable<?> iterable) throws ScriptException, NoSuchMethodException;

    Object executeScript(String resourceID, String editor, String functionName, Runtime runtime, Object... params) throws ScriptException, NoSuchMethodException, InvocationTargetException, IllegalAccessException;

    Object executeScript(ResourceID resourceId, String editor, String functionName, Runtime runtime, Object... params) throws ScriptException, NoSuchMethodException, InvocationTargetException, IllegalAccessException;

    Object executeScript(String resourceID, String editor, HyperionScript script, String functionName, Runtime runtime, Object... params) throws ScriptException, NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}