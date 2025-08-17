// import java.util.Scanner;
// public class count_pyramid {

//     public static void countPyra(int n){
//         int counter = 1;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print(counter + "  ");
//                 counter++;
//             }
//             System.out.println();
//         }


//     }


//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in)){
//             System.out.println("Enter the number of rows:");
//             int n = sc.nextInt();
//             countPyra(n);

//         }
        
//     }
// }







// import java.util.Scanner;
// public class count_pyramid {

//     public static void countPyra(int n){
        
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*" + "  ");
                
//             }
//             System.out.println();
//         }


//     }


//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in)){
//             System.out.println("Enter the number of rows:");
//             int n = sc.nextInt();
//             countPyra(n);

//         }
        
//     }
// }








import java.util.Scanner;
public class count_pyramid {

    // public static void countPyra(int n){
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=n-i; j++){
    //             System.out.print("\t");
    //         }
    //         for(int j = 1; j<=i; j++){
    //             System.out.print("*\t\t");
                
    //         }
    //         System.out.println();
    //     }
    // }

    public static void diamonD(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<n-i+1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i = n-1; i>=1; i--){
            for(int j = 1; j<n-i+1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of rows:");
            int n = sc.nextInt();
            // countPyra(n);
            diamonD(n);

        }
        
    }
}
