import java.util.Scanner;
public class best_time_buy_sell{

    public static int bestSell(int arr[]){
        int n = arr.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < n; i++){
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;


    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the element: ");
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();

            }
            int digi = bestSell(arr);
            System.out.println("Best time to buy and sell is: "+digi);
        }
    }
}