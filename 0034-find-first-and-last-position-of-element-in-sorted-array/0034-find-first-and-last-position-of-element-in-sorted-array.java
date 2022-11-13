class Solution {
    public int[] searchRange(int[] nums, int target) {
        // if(nums.length==0)
        //     return new int[]{-1,-1};
        // if(target>nums[nums.length-1] || target<nums[0]){
        //     return new int[]{-1,-1};
        // }
        int f=-1,l=-1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                f=i;
                while(i<nums.length && nums[i]==target ){
                    i++;
                }
                l=i-1;
            }
        }
        return new int[]{f,l};
    }
}