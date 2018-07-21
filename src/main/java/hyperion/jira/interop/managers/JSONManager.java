package hyperion.jira.interop.managers;

import javax.script.ScriptException;
import java.lang.reflect.Type;
import java.util.Map;

public interface JSONManager {
    String toJSON(Object obj);

    <T> T fromJSON(String json, Class<T> genericType);
    <T> T fromJSON(String json, Type type);

    Map<String, Object> fromJSONUsingJS(String json) throws ScriptException, NoSuchMethodException;
    String toJSONUsingJS(Object obj) throws ScriptException, NoSuchMethodException;

    <T> T getJSONEditorContent(String resourceID, String editorID);
    <T> T getJSONEditorContent(String resourceID, String editorID, Class<T> type);

    String getUnparsedJSONEditorContent(String resourceID, String editorID);
}
