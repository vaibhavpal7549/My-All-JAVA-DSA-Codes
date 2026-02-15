import java.util.*;
public class union_and_intersection_two_arrays {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Count number of elements in the union and intersection of two arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        //Union of two arrays
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        System.out.println("Union of two arrays: " + set.size()); //Output: 8
        //Printing the elements in the union of two arrays i.e. unique elements from both arrays
        System.out.print("Elements in the union of two arrays: ");
        for (int i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
        set.clear();
        //Intersection of two arrays
        for (int i : arr1) {
            set.add(i);
        }
        System.out.print("Element in the intersection of two arrays: " );
        int count = 0;
        for (int i : arr2) {
            if (set.contains(i)) {
                count++;
                //Printing the elements in the intersection of two arrays
                System.out.print(i + " ");
                set.remove(i); //To avoid counting duplicates in the intersection
            }
        }
        System.out.println();
        System.out.println("Intersection of two arrays: " + count); //Output: 2
    }
}
