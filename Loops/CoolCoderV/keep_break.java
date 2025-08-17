// package Sigma 4.0.DSA.Loops.CoolCoderV;
import java.util.Scanner;
public class keep_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println("Entered number is: " +n);

        }
        
    }
    
}
