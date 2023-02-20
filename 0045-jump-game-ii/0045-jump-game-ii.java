class Solution {
    public int jump(int[] nums) {
        int si = 1, ei = nums[0], count = 0;
        while(si < nums.length){
            if(ei >= nums.length){
                return count+1;
            }
            
            int mx = ei;
            while(si < nums.length && si <= ei){
                mx = Math.max(mx, nums[si] + si);
                si++;
            }
            
            ei = mx;
            count++;
        }
        return count++;
    }
}