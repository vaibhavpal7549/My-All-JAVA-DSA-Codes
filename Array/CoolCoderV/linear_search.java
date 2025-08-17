import java.util.Scanner;
public class linear_search {

    public static int linearSearch(int num[], int key){
        int n = num.length;
        for (int i = 0; i < n; i++) {
            if (num[i] == key) {
                return i;
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
            System.out.println("Enter the key value: ");
            int key = sc.nextInt();
            int index = linearSearch(num, key);
            if(index != -1){
                System.out.println("Element is present at index " + index);
            }
            else{
                System.out.println("Element is not present in array");
            }
            
        }
        
    }
}
