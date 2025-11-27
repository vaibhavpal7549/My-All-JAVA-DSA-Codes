import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
        } else if (n == 2) {
            System.out.println(n + " is a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}





//Bruteforce Version
// class Solution {
//     static boolean isPrime(int n) {
//         if (n <= 1) return false; // 0 and 1 are not prime
//         for (int i = 2; i < n; i++) {
//             if (n % i == 0)
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int n = 17;
//         System.out.println(n + " is Prime? " + isPrime(n));
//     }
// }

//Optimised Version
// class Solution {
//     static boolean isPrime(int n) {
//         if (n <= 1) return false;
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0)
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int n = 29;
//         System.out.println(n + " is Prime? " + isPrime(n));
//     }
// }
