class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=-1,l=-1;
        
        int si = 0, ei = nums.length-1;
        
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(nums[mid] >= target){
                ei = mid - 1;
            }
            else if(nums[mid] < target){
                si = mid + 1;
            }
            if(nums[mid] == target){
                f = mid;
            }
        }
        
        si = 0; ei = nums.length - 1;
        
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(nums[mid] <= target){
                si = mid + 1;
            }
            else if(nums[mid]>target){
                ei = mid - 1;
            }
            if(nums[mid] == target){
                l = mid;
            }
        }
        
        return new int[]{f,l};
    }
}