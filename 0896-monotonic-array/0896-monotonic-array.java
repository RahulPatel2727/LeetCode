class Solution {
    public boolean isMonotonic(int[] nums) {
        int in = 0;
        int dc = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] <= nums[i]){
                in++;
            }
            if(nums[i-1]>=nums[i]){
                dc++;
            }
        }
        if(in==nums.length-1 || dc == nums.length-1){
            return true;
        }
        return false;
    }
}