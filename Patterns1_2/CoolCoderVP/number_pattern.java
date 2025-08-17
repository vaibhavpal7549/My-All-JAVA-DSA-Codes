import java.util.Scanner;
public class number_pattern{

    public static void ppr(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=3; j++){
                System.out.print(count + " ");
                count++;

            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        ppr(n);
        }

    }
}