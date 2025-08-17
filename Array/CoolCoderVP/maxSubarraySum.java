

import java.util.Scanner;

public class maxSubarraySum {

    public static void subArray(int num[]) {
        int max = Integer.MIN_VALUE;
        int curr;
        int n = num.length;
        int ts = 0; // total subarrays

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                curr = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    curr = curr + num[k];

                }
                System.out.print("The sum is: " + curr);
                if(curr > max){
                    max = curr;
                }

                System.out.println();
                

                ts++;
            }
            
        }
        System.out.println("The total maxSubarraySum is: " + max);
        System.out.println("The total number of subarrays is: " + ts);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            int num[] = new int[n];
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            subArray(num);
        }
    }
}

