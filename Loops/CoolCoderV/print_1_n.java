// package Sigma 4.0.DSA.Loops.CoolCoderV;
import java.util.Scanner;
public class print_1_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 1;

        while(n >= count) {
            System.out.println(count);
            count++;
        }
        
    }
    
}
