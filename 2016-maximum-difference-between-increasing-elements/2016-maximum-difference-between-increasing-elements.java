class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1, min = Integer.MAX_VALUE;
        for(int it : nums){
            min = Math.min(min,it);
            ans = Math.max(ans, it - min);
        }
        if(ans == 0)
            return -1;
        return ans;
    }
}