import java.util.Scanner;
public class floyds_triangle {


    public static void floydTri(int n){
        int counter = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();

            floydTri(n);

        }
        
    }
}
