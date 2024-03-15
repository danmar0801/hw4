import java.util.HashMap;
import java.util.Map;

public class SingletonFactory {
    private static final Map<String, Object> instances = new HashMap<>();

    private SingletonFactory() {}

    public static synchronized Object getInstance(String key) {
        return instances.computeIfAbsent(key, k -> {
            switch (k) {
                case "CarbsFactory":
                    return new CarbsFactory();
                case "ProteinFactory":
                    return new ProteinFactory();
                case "FatsFactory":
                    return new FatsFactory();
                default:
                    return null;
            }
        });
    }
}
