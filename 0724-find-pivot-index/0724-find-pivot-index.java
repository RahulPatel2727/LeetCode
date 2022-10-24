class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
        for(int i:nums){
            sum+=i;
        }
        int lsum = 0;
        for(int i=0;i<nums.length;i++){
            if((sum - nums[i]-lsum)==(lsum)){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}