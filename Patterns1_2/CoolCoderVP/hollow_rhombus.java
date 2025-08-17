import java.util.Scanner;
public class hollow_rhombus {

    public static void hollow_Rhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();

            hollow_Rhombus(n);
            
        }
    }
}
