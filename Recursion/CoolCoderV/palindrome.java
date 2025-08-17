// import java.util.Scanner;


// public class palindrome {

//     public static void palin(int n){
//         int temp = n;
//         int sum = 0;
//         while (n > 0) {
//             int rem = n % 10;
//             sum = sum * 10 + rem;
//             n = n / 10;
//         }
//         if (temp == sum) {
//             System.out.println("The number is a palindrome");
//         }


//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         palin(n);

//     }
// }



import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(int n, int rev) {
        if (n == 0) {
            return rev == 0; // Base case: if n is 0, check if rev is also 0
        }
        rev = rev * 10 + n % 10; // Build the reverse number
        return isPalindrome(n / 10, rev); // Recursive call with reduced n
    }

    public static void palin(int n) {
        if (isPalindrome(n, 0)) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        palin(n);

        sc.close();
    }
}



