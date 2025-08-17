import java.util.Scanner;
public class inverted_half_pyramid_num {

    
    public static void inverPy(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();

            inverPy(n);


        }
        
    }
}
