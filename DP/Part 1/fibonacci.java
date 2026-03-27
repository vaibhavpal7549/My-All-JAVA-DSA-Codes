public class fibonacci {
    public static int fibonacci(int n) { //tc: O(2^n) sc: O(n)
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 4; // Change this value to compute Fibonacci for different n
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}

