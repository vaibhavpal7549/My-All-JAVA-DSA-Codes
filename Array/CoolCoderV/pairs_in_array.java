

import java.util.Scanner;
public class pairs_in_array {

    public static void pairsArray(int num[]){
        int tp = 0;
        int n = num.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                // 2 4 6 8 10
                System.out.print("(" + num[i] + " , " + num[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs found: " + tp);



    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            int num[] = new int[n];
            System.out.println("Enter the elements: ");
            for(int i = 0; i<n; i++){
                num[i] = sc.nextInt();
            }

            pairsArray(num);
            // System.out.println("Pairs array is: "+ Arrays.toString(num));

            
        }
        
    }
}


