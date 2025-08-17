// package CoolCoderV;

import java.util.Scanner;

public class increasing_order {

    public static void incd(int n){
        //Base case
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        incd(n-1);
        System.out.print(n + " ");

    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();
            incd(n);
        }

    }
    
}
