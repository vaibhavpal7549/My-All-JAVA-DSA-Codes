import java.util.Scanner;
public class isEven1 {

    public static boolean iseven1(int n) {
        return n%2 == 0;

    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean bp = iseven1(n);
        if (bp == true) {
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }

        sc.close();


        
    }
}
