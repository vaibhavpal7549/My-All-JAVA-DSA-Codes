


import java.util.Scanner;
public class clear_ith {

    public static void ith(int n, int i){
        int bitMask = ~(1<<i);

        int res = bitMask & n;
        System.out.println(res);


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

