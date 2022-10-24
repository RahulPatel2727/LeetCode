class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        int left = 0;
        for(int i=0;i<nums.length; i++){
            left+=nums[i];
            if(sum-left == left-nums[i] ){
               return i; 
            }
        }
        return -1;
    }
}