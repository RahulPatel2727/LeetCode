class Solution {
   public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return getMaxAmount(nums);
    }
    
    
    public int getMaxAmount(int[] nums) {
       int dp[] = new int[nums.length];
       dp[0] = nums[0];
       dp[1] = Integer.max(nums[1], nums[0]); 
       for(int i = 2; i < nums.length; i++) {
           if(dp[i] > 0) return dp[i]; 
            dp[i] = Integer.max(nums[i] + dp[i-2], dp[i-1]);
       }
       return dp[nums.length-1]; 
    }
}