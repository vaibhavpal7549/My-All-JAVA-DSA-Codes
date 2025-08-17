

import java.util.Scanner;
public class update_ith {

    public static int set(int n, int i){
        int bitMask = 1<<i;

        int res = bitMask | n;
        return res;
    }

    public static int clear(int n, int i){
        int bitMask = ~(1<<i);

        int res = bitMask & n;
        return res;
    }


    public static int ith(int n, int i, int newBit){
        if(newBit == 0){
        return clear(n, i);
        }else{
        return set(n, i);
        }
    
    }

    public static int ith3(int n, int i, int newBit){

        int n1 = clear(n, i);
        int bitMask = newBit<<i;
        return n1 | bitMask;


    }



    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            System.out.println("Enter the ith value: ");
            int i = sc.nextInt();
            System.out.println("Enter the new Bit: ");

            int newBit = sc.nextInt();
            ith3(n, i, newBit);


        }
        
    }
}

