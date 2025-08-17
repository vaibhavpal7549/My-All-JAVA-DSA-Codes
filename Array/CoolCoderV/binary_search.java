

import java.util.Arrays;
import java.util.Scanner;
public class binary_search {

    public static int binarySearch(int num[], int key){
    
        int start = 0; // start of the array
        int end = num.length - 1; //end of the array
        while(start <= end){
            //int mid = (start + end) / 2; // middle of the array
            int mid = start + (end - start) / 2;
            if(num[mid] == key){
                return mid;
            }
            else if(num[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;


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
            Arrays.sort(num);
            System.out.println("Enter the key value: ");
            int key = sc.nextInt();
            int index = binarySearch(num, key);
            if(index != -1){
                System.out.println("Element is present at index " + index);
            }
            else{
                System.out.println("Element is not present in array");
            }
            
        }
        
    }
}
