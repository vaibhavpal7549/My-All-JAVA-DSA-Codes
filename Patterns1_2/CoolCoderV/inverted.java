// import java.util.Scanner;
// public class inverted {
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         System.out.println("Enter the number of rows: ");
//         int n = sc.nextInt();
//         for(int i =1; i<= n; i++){
//             for(int j = n; j>=i; j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
        
//     }
// }





import java.util.Scanner;
public class inverted {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i =1; i<= n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
