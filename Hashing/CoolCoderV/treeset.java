public class treeset {
    public static void main(String[] args) {
            java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();
    
            // Adding elements to the TreeSet
            treeSet.add("Apple"); //O(log n)
            treeSet.add("Banana"); //O(log n)
            treeSet.add("Cherry");
            treeSet.add("Date");
            treeSet.add("Elderberry");
    
            // Displaying the TreeSet
            System.out.println("TreeSet: " + treeSet);
    
            // Checking if an element exists
            String elementToCheck = "Cherry";
            if (treeSet.contains(elementToCheck)) {
                System.out.println(elementToCheck + " is present in the TreeSet.");
            } else {
                System.out.println(elementToCheck + " is not present in the TreeSet.");
            }
    
            // Removing an element
            String elementToRemove = "Banana";
            if (treeSet.remove(elementToRemove)) {
                System.out.println(elementToRemove + " has been removed from the TreeSet.");
            } else {
                System.out.println(elementToRemove + " was not found in the TreeSet.");
            }
    
            // Displaying the TreeSet after removal
            System.out.println("TreeSet after removal: " + treeSet);
    }
}
