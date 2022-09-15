class Solution {
    public int maxProfit(int[] prices) {
        return buyStock(prices);
    }
    private static int buyStock(int []arr){
        int min=arr[0];
        int max=0;
        for(int i:arr){
            min=Math.min(min,i);
            int profit=i-min;
            max=Math.max(max,profit);
        }
        return max;
    }
}