import java.util.HashMap;
public class creating_hashmap {
    public static void main(String[] args) {
        //Creating a HashMap to store String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();

        //Adding key-value pairs to the HashMap O(1)
        map.put("CoolCoderV", 1);
        map.put("Sigma", 2);
        map.put("Shivika", 143);

        //Printing the HashMap follows the format {key=value, key=value, ...}
        //in unordered manner
        System.out.println(map);
        
        //following are some of the methods of HashMap
        //get method O(1)
        System.out.println(map.get("Sigma")); //returns the value associated with the specified key, or null if the key is not present
        System.out.println(map.get("Vaibhav")); //returns null if key is not present

        //containsKey method O(1)
        System.out.println(map.containsKey("Shivika")); //returns true if key is present, false otherwise
        System.out.println(map.containsKey("Vaibhav")); //returns false as key is not present

        //remove method  O(1)
        map.remove("CoolCoderV"); //removes the key-value pair with the specified key and returns the value associated with the key, or null if the key was not present

        //size method O(1)
        System.out.println(map.size()); //returns the number of key-value pairs in the HashMap

        //ISEmpty method O(1)
        System.out.println(map.isEmpty()); //returns true if the HashMap contains no key-value pairs, false otherwise

        //map.clear(); //removes all key-value pairs from the HashMap
        
        System.out.println(map);

    }
}
