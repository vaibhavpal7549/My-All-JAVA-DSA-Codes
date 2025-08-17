import java.util.Scanner;
public class min_maxEl {

    public static void minMax(int matrix[][], int n, int m){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i = 0 ;i<n; i++){
            for(int j = 0; j<m ;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
                
            }
        }
        System.out.println("Min: " + min + " Max: " + max);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        minMax(matrix, n, m);
        
    }
}
