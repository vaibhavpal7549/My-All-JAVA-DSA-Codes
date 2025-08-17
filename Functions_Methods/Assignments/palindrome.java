import java.util.Scanner;
public class palindrome {


    public static void palindromeC(int n){
        int temp = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;

        }
        if(rev == temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            palindromeC(n);
        }
    }
}

