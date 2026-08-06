

import java.util.*;

public class two_sum {

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int diff = target - arr[i];

            if (visited.containsKey(diff)) {
                return new int[]{visited.get(diff), i};
            }

            visited.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(arr, target);

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Target : " + target);
        System.out.println("Indices : " + Arrays.toString(ans));
    }
}