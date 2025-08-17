


import java.util.Scanner;
public class linear_search_string {

    public static int linearSearch(String item[], String str){
        int n = item.length;
        for (int i = 0; i < n; i++) {
            if (item[i].equals(str)) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            String item[] = new String[n];
            System.out.println("Enter the items: ");
            for(int i = 0; i<n; i++){
                item[i] = sc.next();
            }
            System.out.println("Enter the string to search: ");
            String str = sc.next();
            int index = linearSearch(item , str);
            if(index != -1){
                System.out.println("Item is present at index " + index + " in the list");
            }
            else{
                System.out.println("Sorry! Item is not present in the list");
            }
            
        }
        
    }
}
