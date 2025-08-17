


// package CoolCoderV;

import java.util.Scanner;

public class sum_n_natural_num {

    public static int Natu(int n){
        //Base case
        if(n==1){
            return 1;
        }

        //Recursion Case
        int sn1 = Natu(n-1);
        int sn = n + sn1;
        return sn;



    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();
            int s = Natu(n);
            System.out.println(s);
        }

    }
    
}
