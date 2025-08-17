
import java.util.Arrays;
import java.util.Scanner;
public class reverse_array {

    public static void reverseArray(int num[]){
        int n = num.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;

        }


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

            reverseArray(num);
            System.out.println("Reversed array is: "+ Arrays.toString(num));

            
        }
        
    }
}

