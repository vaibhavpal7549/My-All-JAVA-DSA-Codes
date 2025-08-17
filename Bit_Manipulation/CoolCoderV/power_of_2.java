

import java.util.Scanner;
public class power_of_2 {


    public static boolean ipow(int n){
        return (n&(n-1)) == 0;


    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            boolean br = ipow(n);
            if(br){
                System.out.println("Power of two");
            }else{
                System.out.println("Not a power of two");
            }



        }
        
    }
}
