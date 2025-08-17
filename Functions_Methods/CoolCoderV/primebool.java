import java.util.Scanner;
public class primebool {

    public static boolean isPrime(int n) {
        // boolean isPrime = true;
        if (n <= 1) {
            // isPrime = false;
            return false;
        }
        if(n == 2){
            // isPrime =  true;
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                // isPrime =  false;
                return false;
            }
        }
        // return isPrime;
        return true;

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();

            boolean bp = isPrime(n);
            if(bp) System.out.println("The given number is prime");
            else System.out.println("The given number is not prime");
        }
        


    }
}
