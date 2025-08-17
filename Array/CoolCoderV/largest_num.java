

import java.util.Scanner;
public class largest_num {

    public static int largest(int num[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("The smallest number is: " + min);
        return max;



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

            int realone = largest(num);
            System.out.println("Largest number is: "+realone);
            
        }
        
    }
}
