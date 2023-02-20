class Solution {
    public int searchInsert(int[] nums, int target) {
        int si = 0, ei = nums.length - 1, mid;
        while(si <= ei){
            mid = si + (ei - si)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                si = mid + 1;
            }
            else  if(nums[mid] > target){
                ei = mid - 1;
            }
        }
        return si;
    }
}