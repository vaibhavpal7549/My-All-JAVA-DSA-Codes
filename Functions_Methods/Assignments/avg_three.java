import java.util.Scanner;
public class avg_three {

    public static double avg(int a, int b, int c) {
        double average = (a + b + c)/ 3;
        return average;

    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            double average = avg(a, b, c);
            System.out.println("The average of three numbers is: " + average);
        }

        
    }
}
