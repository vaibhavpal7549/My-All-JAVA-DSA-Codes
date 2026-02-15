import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Duplicate, will not be added
        set.add(1); // Duplicate, will not be added
        System.out.println(set); // Output: [1, 2, 3]
        System.out.println(set.contains(2)); // true
        set.remove(2);
        System.out.println(set.contains(2)); // false
        System.out.println(set.size()); // 2
        System.out.println(set.isEmpty()); // false
        set.clear();
        System.out.println(set.isEmpty()); // true

    }
}
