import java.util.Scanner;
public class facto {

    public static int factprint(int a){
        int fact = 1;
        for(int i = 1; i<=a;i++){
            fact *= i;

        }
        return fact;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int fact = factprint(n);
            System.out.println("The factorial of the number "+ n + " is: " + fact);
        }

    }
}
