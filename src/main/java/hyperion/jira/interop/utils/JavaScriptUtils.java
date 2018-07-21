package hyperion.jira.interop.utils;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaScriptUtils {
    private static final ObjectMapper mapper = new ObjectMapper();
    static {
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static <T> T fromJSObject(Object input, Class<T> type) {
        if (input.getClass().getName().equalsIgnoreCase("jdk.nashorn.api.scripting.ScriptObjectMirror")) {
            return mapper.convertValue(convertForObjectMapper(input), type);
        } else if (input.getClass().getName().equalsIgnoreCase(type.getName()) || input instanceof Iterable) {
            return (T) input;
        } else {
            throw new RuntimeException("Unknown type: "+input.getClass().getName());
        }
    }

    private static Object convertForObjectMapper(Object input) {
        if (input instanceof Map) {
            Map<String, Object> map = (Map<String, Object>) input;
            if (isArray(map.keySet())) {
                List<Object> list = new ArrayList<>();
                for (Object value : map.values()) {
                    list.add(convertForObjectMapper(value));
                }
                return list;
            } else {
                for (String key : map.keySet()) {
                    map.put(key, convertForObjectMapper(map.get(key)));
                }
                return map;
            }
        } else {
            return input;
        }
    }

    private static boolean isArray(Set<String> keys) {
        for (String key : keys) {
            if (!StringUtils.isNumeric(key)) {
                return false;
            }
        }
        return true;
    }
}