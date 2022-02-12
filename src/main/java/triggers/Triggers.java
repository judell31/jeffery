package triggers;

import java.util.HashMap;

public class Triggers {
    private static final HashMap<String, String> triggers = new HashMap<>();

    // Todo: Look at making this a list instead of a map
    private static HashMap<String, String> triggerMap() {
        return triggers;
    }

    public static String triggerKeys(String mapKey){
//        triggerMap().keySet();
        return triggers.get(mapKey);
    }
}
