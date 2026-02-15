import java.util.*;
public class linked_hashSet {
    public static void main(String[] args) {
            // java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>();
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            // Adding elements to the LinkedHashSet
            linkedHashSet.add("Apple");
            linkedHashSet.add("Banana");
            linkedHashSet.add("Cherry");
            linkedHashSet.add("Date");
            linkedHashSet.add("Elderberry");
    
            // Displaying the LinkedHashSet
            System.out.println("LinkedHashSet: " + linkedHashSet); // Output will be in the order of insertion
            //Output is here: LinkedHashSet: [Apple, Banana, Cherry, Date, Elderberry]
            // Checking if an element exists
            String elementToCheck = "Cherry";
            if (linkedHashSet.contains(elementToCheck)) {
                System.out.println(elementToCheck + " is present in the LinkedHashSet.");
            } else {
                System.out.println(elementToCheck + " is not present in the LinkedHashSet.");
            }
    
            // Removing an element
            String elementToRemove = "Banana";
            linkedHashSet.remove(elementToRemove);
            System.out.println("After removing " + elementToRemove + ": " + linkedHashSet);
    }
}
