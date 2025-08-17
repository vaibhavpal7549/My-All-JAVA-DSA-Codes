public class best_time_buy_sell_stock_121 {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0; // Handle empty array case

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            // Update the minimum price
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit
            int profit = price - minPrice;
            // Update the maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        best_time_buy_sell_stock_121 stock = new best_time_buy_sell_stock_121();
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example prices
        System.out.println("Max Profit: " + stock.maxProfit(prices)); // Should print 5
    }
}



/*
class Solution {
    public int maxProfit(int[] prices) {
        int m = prices[0];
        for(int price : prices){
            m = Math.min(m, price);
        }
        int idx = prices[m];
        for(int i = idx; i<prices.length; i++){
            int max = prices[i+1];
            int temp=0;
            if(max > temp ){
                temp = max;
                max = prices[i+1];

            }
            
        }
        int profit = max - m;
        return profit;

        
    }
    
}
 */
