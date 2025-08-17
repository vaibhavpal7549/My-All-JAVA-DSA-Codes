


import java.util.Scanner;
public class num_pattern{

    public static void ppr(int n, int m){
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
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
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();

        ppr(n, m);
        }

    }
}