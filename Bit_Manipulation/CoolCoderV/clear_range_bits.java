

import java.util.Scanner;
public class clear_range_bits {

    public static void ith(int n, int i, int j){

        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int bitMask = a | b;
        int res = bitMask & n;
        System.out.println(res);



    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            System.out.println("Enter the ith value: ");
            int i = sc.nextInt();
            System.out.println("Enter the jth value: ");
            int j = sc.nextInt();

            ith(n, i, j);


        }
        
    }
}

