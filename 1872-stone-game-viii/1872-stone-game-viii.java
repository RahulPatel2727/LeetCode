class Solution {
    public int stoneGameVIII(int[] stones) {
        
        int dp[] = new int[stones.length-1]; // dp[i] stores prefix sum from [0,i+1] (inclusive)
        
        dp[0] = stones[0] + stones[1];
        
        for(int i = 1;i<=stones.length-2;i++){
            dp[i] = dp[i-1] + stones[i+1];
        }
        
        int max = dp[dp.length-1]; // max -> max score a player can get 
            
        for(int i = dp.length-2;i>=0;i--){
            
            max = Math.max(max , dp[i]-max);
            
        }
        
        return max;
            
    }
}