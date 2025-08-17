


import java.util.Scanner;
public class clear_last_ith {

    public static void ith(int n, int i){
        int bitMask = (-1)<<i;
        int n1 =  n & bitMask;
        System.out.println(n1);
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            System.out.println("Enter the ith value: ");
            int i = sc.nextInt();

            ith(n, i);


        }
        
    }
}

