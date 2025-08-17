// package Sigma 4.0.DSA.Loops.CoolCoderV;
import java.util.Scanner;
public class sum_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        while(n >= count){
            sum += count;
            count++;

        }
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
        
    }
    
}
