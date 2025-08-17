import java.util.Scanner;

public class bicoeff{

    public static int factprint(int a){
        int fact = 1;
        for(int i = 1; i<=a;i++){
            fact *= i;
        }
        return fact;
    }

    public static int bincoeff(int n, int r){

        int fact_n = factprint(n);
        int fact_r = factprint(r);
        int fact_n_r = factprint(n-r);
        return fact_n/(fact_r*fact_n_r);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            int n = sc.nextInt();
            System.out.println("Enter the value of r: ");
            int r = sc.nextInt();

            int ncr = bincoeff(n, r);
            System.out.println("The value of ncr is: " + ncr);
        }
    }
}
