import java.util.*;
public class iterate {
    public static void main(String[] args) {
        //Iterate on hashmap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("CoolCoderV", 1);
        map.put("Sigma", 2);
        map.put("Shivika", 143);

        //Iterating over keys
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(key + " = " + map.get(key)); // Accessing value using key
        }

        Set<String> keys = map.keySet(); // Using Set to get keys
        System.out.println("Keys using Set: " + keys); // Using Set to get keys
        

        //Iterating over values
        System.out.println("Values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        Collection<Integer> values = map.values(); // Using Collection to get values
        // Or Set<Integer> values = map.values(); // Using Set to get values
        // Note: map.values() returns a Collection, not a Set, because values can be duplicated in a HashMap.
        System.out.println("Values using Collection: " + values); // Using Collection to get values

        //Iterating over key-value pairs
        System.out.println("Key-Value pairs:");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entries using Set: " + entries); // Using Set to get key-value pairs

    }
}
