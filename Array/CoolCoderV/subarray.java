

import java.util.Scanner;

public class subarray {

    public static void subArray(int num[]) {
        int n = num.length;
        int ts = 0; // total subarrays

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                    if (num[k] < min) {
                        min = num[k];
                    }
                    if (num[k] > max) {
                        max = num[k];
                    }
                }

                System.out.println("| Sum: " + sum + ", Min: " + min + ", Max: " + max);
                ts++;
            }
        }
        System.out.println("The total number of subarrays is: " + ts);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            int num[] = new int[n];
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            subArray(num);
        }
    }
}










// import java.util.Scanner;
// public class subarray {

//     public static void subArray(int num[]){
//         int n = num.length;

//         int ts = 0;
//         for(int i = 0; i<n; i++){
//             for(int j = i; j<n; j++){
//                 for(int k = i; k<=j; k++){
//                     System.out.print(num[k] + " ");

//                 }
                
//                 ts++;
//                 System.out.println();
                
//             }
//         }
//         System.out.println("The total subArray is: " + ts);



//     }
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)){
//             System.out.println("Enter the size of the array: ");
//             int n = sc.nextInt();

//             int num[] = new int[n];
//             System.out.println("Enter the elements: ");
//             for(int i = 0; i<n; i++){
//                 num[i] = sc.nextInt();
//             }
//             subArray(num);

        
//         }
        
//     }
// }
