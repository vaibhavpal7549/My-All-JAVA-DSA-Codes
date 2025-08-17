// package Java.Java_Collections_Framework.Map.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hash {
    public static void main(String[] args) {
        // country(key) and population(value)
        //Unordered Map
        HashMap <String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 130);
        map.put("China", 140);
        map.put("America", 300);


        map.put("India", 150); // dubaara karne par update ho jaata hai
        System.out.println(map);

        map.put("India", 200);
        map.put("Pakistan", 100);
        System.out.println(map);

        //Search or lookup operation in hashmap
        if(map.containsKey("China")){
            System.out.println("Present in the map");
        }
        else{
            System.out.println("Not present in the map");
        }

        // get value from map
        System.out.println(map.get("China")); // Output: 140
        System.out.println(map.get("Indonesia")); // Output: null

        int []arr = {1,2,3};
        for(int i = 0; i<3; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        System.out.println();

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " " + map.get(key));
        }

        //remove
        map.remove("India");
        System.out.println(map);
        System.out.println();

        map.size();
        System.out.println(map);


        

        
    }
    
}
