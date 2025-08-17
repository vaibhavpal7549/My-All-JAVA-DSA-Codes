import java.util.*;
// https://www.geeksforgeeks.org/the-stock-span-problem/
// The stock span problem is a financial problem where we need to find the span of stock prices over a given period.
// The span of a stock's price on a given day is the number of days before this day
// for which the price of the stock was less than or equal to the price on this day.


public class stock_span {

    // Function to calculate the stock span
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1; // The span of the first day is always 1
        s.push(0); // Push the index of the first day onto the stack
        for(int i = 1; i < stocks.length; i++){
            int currPrice = stocks[i]; // Current stock price
            // Pop elements from the stack while the current price is greater than or equal to the price at the index on top of the stack
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop(); // Pop the index from the stack
            }
            if(s.isEmpty()){
                span[i] = i +1; // If the stack is empty, the span is equal to the current index + 1
            } else {
                int prevHigh = s.peek(); // Get the index of the last higher price
                span[i] = i- prevHigh; // The span is the difference between the current index and the last higher price index
            }
            s.push(i); // Push the current index onto the stack
        }
    }
    public static void main(String[] args) {
        int[] stocks = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
