// package CoolCoderV;

import java.util.*;


public class decreasing_order{

    public static void printDec(int n){
        //Base condition
        if(n==1){
            System.out.println(n);
            return;
        }

        //Recursive call
        System.out.print(n + " ");
        printDec(n-1);

    }



    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of elements");
            int n = sc.nextInt();
            printDec(n);
        }

    }
}