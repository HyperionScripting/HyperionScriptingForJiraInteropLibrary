package hyperion.jira.interop.constants;

import java.util.HashMap;
import java.util.Map;

public enum ResourceEditorType {
    TYPESCRIPT(0),
    VELOCITY(1),
    JSON(2);

    private int value;
    private static Map<Integer, ResourceEditorType> map = new HashMap<>();

    ResourceEditorType(int value) {
        this.value = value;
    }

    static {
        for (ResourceEditorType editorType : ResourceEditorType.values()) {
            map.put(editorType.value, editorType);
        }
    }

    public static ResourceEditorType valueOf(int editorType) {
        return map.get(editorType);
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        switch (value) {
            case 0:
                return "TypeScript";
            case 1:
                return "Velocity";
            case 2:
                return "JSON";
            default:
                return "Unknown Editor Type";
        }
    }
}
