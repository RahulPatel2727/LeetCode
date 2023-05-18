class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int it : nums){
            sum += it;
        }
        int pre = 0;
        for(int it = 0; it<nums.length;it++){
            if(sum - (nums[it] + pre) == pre){
                return it;
            }
            else
                pre+=nums[it];
        }
        return -1;
    }
}