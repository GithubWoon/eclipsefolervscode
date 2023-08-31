import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String []args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("seoul", 5000);
        map.put("newyork", 2000);
        map.put("england", 1000);
        System.out.println(map.get("seoul"));
        for (String x : map.keySet()) {
            System.out.println(map.get(x));
        }
    }
}
