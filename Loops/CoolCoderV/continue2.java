// package Sigma 4.0.DSA.Loops.CoolCoderV;
import java.util.Scanner;
public class continue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("you number was: "+n);
        }
    }
    
}
