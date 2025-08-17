

import java.util.Scanner;
public class count_set_bits {


    public static int ipow(int n){
        int count  = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;

        }
        return count;
        


    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int ans = ipow(n);
            System.out.println(ans);


        }
        
    }
}
