import java.util.Scanner;

public class prefix_maxSubArraySum {

    public static void subArray(int num[]) {
        int max = Integer.MIN_VALUE;
        int curr;
        int n = num.length;
        int prefix[] = new int[n];

        prefix[0] = num[0];
        // Calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        // Find the maximum subarray sum using the prefix array
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Calculate current subarray sum using prefix array
                curr = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

                if (curr > max) {
                    max = curr;
                }
            }
        }
        System.out.println("The total maxSubarraySum is: " + max);
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
