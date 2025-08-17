import java.util.Scanner;

public class TwoDArray {

    public static void search(int matrix[][],int key){

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("Element is found at cell (" + i + "," + j + ")");
                }
            }
            System.out.println();
        }
        System.out.println("Element is not found");


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = new int[3][3]; // Correct initialization
        int n = matrix.length, m = matrix[0].length; // Get dimensions
        
        // Input
        System.out.println("Enter elements of 3x3 matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        // System.out.println("Matrix:");
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        search(matrix, 5);
    }
}
