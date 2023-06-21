class Solution {
    public int maxProfit(int[] p) {
        int ans = 0, min = Integer.MAX_VALUE;
        for(int it : p){
            min = Math.min(min, it);
            ans = Math.max(ans, it-min);
        }
        return ans;
    }
}