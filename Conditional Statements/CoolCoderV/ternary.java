import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // ternary operator
        String ternary = (n % 2 == 0) ? "even" : "odd";
        System.out.println(ternary);
    }
}
