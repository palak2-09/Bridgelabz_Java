/*
Stock Span Problem
Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
Hint: Use a stack to keep track of indices of prices in descending order.
 */
package StackQueue;
import java.util.Stack;
import java.util.Arrays;
public class StockSpan {
    void calculateSpan(int[] prices){
        int n=prices.length;
        int[] span=new int[n];

        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            // Remove previous prices less than or equal to current price
            while(!st.empty() && prices[st.peek()]<=prices[i]){
                st.pop();
            }
            //calculate span
            if(st.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }

            //push the current index
            st.push(i);
        }
        System.out.println("Stock prices: " + Arrays.toString(prices));
        System.out.println("Stock span:   " + Arrays.toString(span));
    }
    public static void main(String[] args) {

        StockSpan obj = new StockSpan();

        int prices[] = {100, 80, 60, 70, 60, 75, 85};

        obj.calculateSpan(prices);
    }
}
