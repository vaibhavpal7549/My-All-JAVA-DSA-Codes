import java.util.*;
public class linkedHashmap {
    public static void main(String[] args) {
        //Maintainsan insertion order of keys
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map); // Output: {one=1, two=2, three=3}
        System.out.println(map.get("two")); // Output: 2
        System.out.println(map.containsKey("three")); // Output: true
        System.out.println(map.remove("one")); // Output: 1
        System.out.println(map.keySet()); // Output: [two, three]
    }
}
