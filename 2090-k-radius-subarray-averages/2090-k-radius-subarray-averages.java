class Solution {
    public int[] getAverages(int[] nums, int k) {
        int [] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        if((2*k+1)>nums.length){
            return ans;
        }
        long total = 0;
        
        int si = 0, ei = 0;
        int window = 2 * k + 1;
        while( si<= ei && ei<nums.length){
            while(ei-si+1 != window){
                total += nums[ei];
                ei++;
            }
            total += nums[ei++];
            ans[k++] = (int)(total/window);
            total = total - nums[si++];
        }
        return ans;
    }
}