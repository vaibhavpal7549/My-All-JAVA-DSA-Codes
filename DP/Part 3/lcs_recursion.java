

public class lcs_recursion { //Time Complexity O(2^(n+m))

    public static int lcs(String str1, String str2, int n, int m) {

        // base case
        if (n == 0 || m == 0) {
            return 0;
        }

        // match case
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return 1 + lcs(str1, str2, n - 1, m - 1);
        } 
        // not match
        else {
            return Math.max(
                lcs(str1, str2, n - 1, m),
                lcs(str1, str2, n, m - 1)
            );
        }
    }

    public static void main(String args[]) {

        String str1 = "abcdge";
        String str2 = "abedg";   // LCS = "abd" or "abg"

        int result = lcs(str1, str2, str1.length(), str2.length());

        System.out.println("LCS Length: " + result);
    }
}