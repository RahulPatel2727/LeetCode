class Solution {
    public int search(int[] nums, int target) {
        int si = 0, ei = nums.length;
        while(si < ei){
            int mid = si + (ei - si)/2;
            
            if(nums[mid] >= target){
                ei = mid;
            }
            else{
                si = mid + 1;
            }
        }
        if(si<nums.length && nums[si] == target){
            return si;
        }
        return -1;
    }
}