


public class best_time_to_buy_sell_stock {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int buyPrice = prices[0]; // cite: 2
        int maxProfit = 0; // cite: 2

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i]; // Update lowest buy price cite: 2
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice); // Track max profit cite: 2
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices1)); // Output: 0

        int[] prices2 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices2)); // Output: 5
    }
}