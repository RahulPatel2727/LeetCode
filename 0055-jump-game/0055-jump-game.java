class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length < 2) 
            return true;
        int en = 0;
        for(int i=0;i<nums.length-1;i++){
            en = (en>nums[i]+i) ? en : nums[i]+i;
            if(i+1 > en){
                return false;
            }
        }
        return true;
    }
}