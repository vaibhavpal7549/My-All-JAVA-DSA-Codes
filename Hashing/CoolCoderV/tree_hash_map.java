import java.util.*;
public class tree_hash_map {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map);
        System.out.println(map.get("two")); // Output: 2
        System.out.println(map.containsKey("three")); // Output: true
        System.out.println(map.remove("one")); // Output: 1
        System.out.println(map.keySet()); // Output: [three, two]


    }
}
