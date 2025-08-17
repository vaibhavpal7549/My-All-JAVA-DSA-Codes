import java.util.Scanner;
public class primes_range {


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

    public static void rangePrime(int r){
        for(int i = 2; i <= r; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the range of numbers");
            int r = sc.nextInt();
            rangePrime(r);
        }


    }
}
