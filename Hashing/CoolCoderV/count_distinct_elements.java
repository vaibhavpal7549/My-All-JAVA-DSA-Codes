import java.util.HashSet;
public class count_distinct_elements {
    //Time Complexity: O(n), where n is the number of elements in the array. We iterate through the array once to add elements to the HashSet.
    //Space Complexity: O(n) in the worst case, if all elements in the array are distinct, we will store all of them in the HashSet.
    public static int countDistinctElements(int[] arr) {
        HashSet<Integer> distinctSet = new HashSet<>();
        for (int num : arr) {
            distinctSet.add(num);
        }
        return distinctSet.size();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        int distinctCount = countDistinctElements(arr);
        System.out.println("Number of distinct elements: " + distinctCount); // Output: Number of distinct elements: 5
    }
}
