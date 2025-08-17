import java.util.Scanner;
public class inverted_half_pyramid {

    public static void hollowPyra(int n){

        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
                // System.out.println("* ");
            }
            System.out.println();
        }



    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();

            hollowPyra(n);


        }
    }
}
