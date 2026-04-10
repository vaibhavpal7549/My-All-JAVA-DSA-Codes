public class catalan_number_recursion {
        public static int catalan(int n) { //Time complexity is O(2^n) due to the two recursive calls in the loop
            // Base case
            //Space complexity is O(n) due to the recursive call stack
            if (n == 0 || n == 1) {
                return 1;
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                res += catalan(i) * catalan(n - i - 1);
            }
            return res;
        }
    public static void main(String[] args) {
        int ans = catalan(5);
        System.out.println(ans);
    }
}

