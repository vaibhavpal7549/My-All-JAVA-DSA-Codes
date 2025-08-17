

// package CoolCoderV;

import java.util.Scanner;

public class fact {

    public static int facto(int n){
        //Base case
        if(n==0){
            return 1;
        }
        //Recursion case
        int fnm1 = facto(n-1);
        int fn = n * fnm1;
        return fn;


    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();
            int s = facto(n);
            System.out.println(s);
        }

    }
    
}
