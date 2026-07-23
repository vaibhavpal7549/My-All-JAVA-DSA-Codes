
public class max_bal_str_part {
    public static int maxBalancedPartition(String str, int n) {
        if (n == 0) return 0; // cite: 2

        int count = 0;
        int partitions = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                count++;
            } else if (str.charAt(i) == 'L') {
                count--;
            }

            // Whenever L and R counts are equal, we form 1 partition
            if (count == 0) {
                partitions++;
            }
        }
        return partitions;
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        System.out.println(maxBalancedPartition(str, str.length())); // Output: 3
    }
}