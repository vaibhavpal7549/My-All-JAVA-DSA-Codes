import java.util.*;
public class iteration_hashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        // Using for-each loop //Enhanced for loop
        System.out.println("Using for-each loop:");
        for (String language : set) {
            System.out.println(language); //output may be in any order due to the nature of HashSet
        }
        // Using for loop with toArray
        System.out.println("\nUsing for loop with toArray:");
        String[] languagesArray = set.toArray(new String[0]);
        for (int i = 0; i < languagesArray.length; i++) {
            System.out.println(languagesArray[i]); //output may be in any order due to the nature of HashSet
        }

        // Using iterator
        System.out.println("\nUsing iterator:"); //
        Iterator<String> iterator = set.iterator(); //
        while (iterator.hasNext()) { //null pointer exception
            System.out.println(iterator.next()); //output may be in any order due to the nature of HashSet
        }
    }
}
