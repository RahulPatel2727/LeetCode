class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = {0, 0, 0};
        int total = 0;
      
        for (int i = n-1; i >= 0; i--) {
            total += stoneValue[i];
            
            int curr = Math.max(total - dp[0], Math.max(total - dp[1], total - dp[2]));
            dp[2] = dp[1];
            dp[1] = dp[0];
            dp[0] = curr;
        }
        
        if (dp[0] > total - dp[0]) return "Alice";
        else if (dp[0] < total - dp[0]) return "Bob";
        else return "Tie";
    }
}