package leetCode.TopInterviewQuestions.DynamicProgramming;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int price : prices){
            min = Math.min(min, price);
            max = Math.max(max, price-min);
        }
        return max;
    }
}
