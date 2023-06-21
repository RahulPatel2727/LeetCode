class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int pre = prices[0];
        for(int i : prices){
            if(pre<i){
                ans += i - pre;
                pre = i;
            }
            else
                pre = i;
        }
        return ans;
    }
}