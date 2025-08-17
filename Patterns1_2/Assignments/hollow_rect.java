import java.util.Scanner;
public class hollow_rect {

    public static void hollowRect(int n, int m) {
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            System.out.println("Enter the number of columns: ");
            int m = sc.nextInt();
            hollowRect(n, m);

        }
        
    }
}
