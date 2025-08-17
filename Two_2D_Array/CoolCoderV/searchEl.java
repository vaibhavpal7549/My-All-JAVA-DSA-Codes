

import java.util.Scanner;

public class searchEl {
    public static boolean search(int matrix[][], int n, int m, int key){

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell: " + i +" , " + j);
                    return true;
                }
                
            }
            System.out.println();
        }
        System.out.println("KEY NOT FOUND: ");
        return false;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        
        }
        boolean ans = search(matrix, n, m, 6);
        System.out.println(ans);
        
    }
}

