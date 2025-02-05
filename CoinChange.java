package study.dp;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins  ={1,2,5};

        System.out.println(coinChange(coins, 11));

    }

    public static int coinChange(int[] coins, int amount) {

        //  return minCoin
        // 1
        int minCoin = Integer.MAX_VALUE;
        Map<Integer, Integer> memo = new HashMap<>();
        int out = TopDownRecurrion(coins, amount, memo);
        if( out == Integer.MAX_VALUE) return -1;
        return out;

    }

    public static int TopDownRecurrion(int[] coins, int amount, Map<Integer, Integer> memo){
        if(amount == 0 ){
            return 0;
        }

        if(memo.containsKey(amount)){
            return memo.get(amount);
        }
        int minCoin = Integer.MAX_VALUE;


        for(int i= 0; i < coins.length; i++){

            if(amount >= coins[i]){
                int out =  TopDownRecurrion(coins, amount - coins[i], memo );
                if(out != Integer.MAX_VALUE){
                    minCoin = Math.min(minCoin, out+ 1);
                }
            }
        }

        memo.put(amount, minCoin);
        return memo.get(amount);


    }
}
