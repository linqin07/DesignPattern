import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/12
 */
public class FlyweightFactory {
    private static Map flyweights = new HashMap();

    public FlyweightFactory(String arg) {
        flyweights.put(arg, new FlyweightImpl());
    }

    public static Flyweight getFlyweight(String key) {
        if (flyweights.get(key) == null) {
            flyweights.put(key, new FlyweightImpl());
        }
        return (Flyweight) flyweights.get(key);
    }

    public static int getSize() {
        return flyweights.size();
    }
}
