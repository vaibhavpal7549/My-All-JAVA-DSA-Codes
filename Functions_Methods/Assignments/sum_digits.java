import java.util.Scanner;
public class sum_digits {

    public static int sum(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int total = sum(n);
            System.out.println("Sum of digits of " + n + " is: " + total);
        }

    }
}
