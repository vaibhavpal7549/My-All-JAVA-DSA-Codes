




// package CoolCoderV;

import java.util.Scanner;

public class fibonacci {

    public static int fibo(int n){
        //Base case

        if(n == 0 || n==1){
            return n;
        }

        int fibn1 = fibo(n-1);
        int fibn2 = fibo(n-2);
        int fibn = fibn1 + fibn2;
        return fibn;



    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();
            int s = fibo(n);
            System.out.println(s);
        }

    }
    
}
