import java.util.Scanner;
public class binomialcoeff {

    public static int factprint(int a){
        int fact = 1;
        for(int i = 1; i<=a;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number n: ");
            int n = sc.nextInt();
            System.out.println("Enter the number r: ");
            int r = sc.nextInt();
            int ncr = factprint(n) / (factprint(n-r) * factprint(r));
            System.out.println("The binomial coefficient is: "+ ncr);
        }
        
        
    }
    
}
