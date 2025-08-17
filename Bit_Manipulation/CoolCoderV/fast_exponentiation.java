


import java.util.Scanner;
public class fast_exponentiation {


    public static int ipow(int a, int n){
        int ans = 1;

        while(n > 0){
            if((n&1) != 0){
                ans = ans * a;

            }
            a = a * a;
            n = n>>1;

        }
        return ans;

//TC O(log n) SC O(1)

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the base: ");
            int a = sc.nextInt();
            System.out.println("Enter the power: ");
            int n = sc.nextInt();

            int ans = ipow(a, n);
            System.out.println(ans);


        }
        
    }
}

