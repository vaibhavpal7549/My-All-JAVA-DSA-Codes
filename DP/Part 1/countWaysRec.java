public class countWaysRec {
    public static int countWays(int n) { //Tc: O(2^n) SC: O(n)
        if (n == 0) {
            return 1; // Base case: There is one way to climb zero stairs (do nothing)
        }
        if (n < 0) {
            return 0; // Base case: No way to climb negative stairs
        }
        // Recursive calls: Climb 1 stair or climb 2 stairs
        return countWays(n - 1) + countWays(n - 2); // TC: O(2^n) SC: O(n)
    }
    public static void main(String[] args) {
        int n = 4; // Change this value to compute the number of ways for different n
        System.out.println("Number of ways to climb " + n + " stairs: " + countWays(n));
    }
}



