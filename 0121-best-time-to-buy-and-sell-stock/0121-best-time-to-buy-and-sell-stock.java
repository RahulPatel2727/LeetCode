class Solution {
    public int maxProfit(int[] prices) {
        int minP = prices[0];
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(minP>prices[i]){
                minP = prices[i];
                continue;
            }
            maxProfit = Math.max(maxProfit, Math.abs(minP - prices[i]));
        }
        return maxProfit;
    }
}