class Solution {
    public int maxProfit(int[] prices) {
        return buySell2(prices);
    }
    private static int buySell2(int []arr){
        int ans = 0;
        for(int i=0;i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                ans += arr[i+1]-arr[i];
            }
        }
        return ans;
    }
}