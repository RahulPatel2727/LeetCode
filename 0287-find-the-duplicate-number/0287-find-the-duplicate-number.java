class Solution {
    public int findDuplicate(int[] nums) {
        int si = 1, ei = nums.length;
        int mid;
        int ans = nums[0];
        while(si<=ei){    
            int frq = 0;
            mid = si + (ei - si)/2;
            for(int i=0;i<nums.length;i++){
                if(mid >= nums[i]){
                    frq++;
                }
            }
            if(mid >= frq){
                si = mid+1;
            }
            else if(mid < frq){
                ans = mid;
                ei = mid - 1;
            }
        } 
        return ans;
    }
}