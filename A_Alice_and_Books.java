import java.util.*;
public class A_Alice_and_Books{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int a1 = Integer.MIN_VALUE;
            int a2= Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                if(arr[i]>a1){
                    a2 = a1;
                    a1 = arr[i];
                }
                else if(arr[i]>a2){
                    a2 = arr[i];
                }
            }
            System.out.println(a1 + a2);
        }

    }
}