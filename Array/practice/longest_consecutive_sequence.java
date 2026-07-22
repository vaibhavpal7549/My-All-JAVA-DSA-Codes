// package Array.practice;
import java.util.*;
public class longest_consecutive_sequence {
    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        int n = arr.length;
        Arrays.sort(arr);
        int a1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == a1) {
                a1++;
            }
        }
        System.out.println(a1);
    }
    
}
