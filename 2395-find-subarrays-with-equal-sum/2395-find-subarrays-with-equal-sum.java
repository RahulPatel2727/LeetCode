class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> it = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            if(it.contains(nums[i] + nums[i+1])){
                return true;
            }
            else{
                it.add(nums[i] + nums[i+1]);
            }
        }
        return false;
    }
}