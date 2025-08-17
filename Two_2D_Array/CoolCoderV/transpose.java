import java.util.Scanner;
public class transpose {

    public static void transposeMM(int matrix[][], int n, int m){
        int newMatrix[][] = new int[m][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }

        // output
        System.out.println("Printing transpose of matrix: ");
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [2][3];
        int n = matrix.length, m = matrix[0].length; 
        for(int i = 0; i<n; i++){
            for(int j = 0 ;j <m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //printing original matrix: 
        System.out.println("Printing original matrix: ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        transposeMM(matrix, n, m);
    }
}
