package study.dp;

import java.util.Collections;
import java.util.PriorityQueue;

public class BuyAndSellStock3 {

    public static void main(String[] args) {

        int[] prices = {1,2,3,4,5};

        System.out.println(maxProfit(prices));

    }

    private static int maxProfit =0;


    public static int maxProfit(int[] prices) {

        maxProfit =0;
        helper(prices, 0, false, 2);
        return maxProfit;

    }

    public static int helper(int[] prices, int idx, boolean buy, int j) {

        if (idx == prices.length  || j ==0)
            return 0;

        int result =  helper(prices, idx + 1, false, j);

        if (buy) {
            result =Math.max(result, helper(prices, idx + 1, false, j-1)+ prices[idx]) ;
        } else {
            result =Math.max(result, helper(prices, idx + 1, true, j) - prices[idx]) ;
        }

        maxProfit = Math.max(result, maxProfit);
        return result;

    }
}
