import java.util.Scanner;
public class butterfly {

    public static void butter(int n){
        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }



    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of rows:");
            int n = sc.nextInt();
            butter(n);


        }
    }
}
