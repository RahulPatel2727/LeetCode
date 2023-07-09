class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int ksum = 0;
        for(int it : nums){
            ksum += it;
            max = Math.max(max, ksum);
            if(ksum<0){
                ksum = 0;
            }
        }
        return max;
    }
}