class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int z = 1;
        int si = 0, cur = 0, ei = nums.length-1;
        int c = 0, zi = -1;
        while(cur<=ei){
            while(cur <= ei && (nums[cur]==1 || z == 1)){
                if(nums[cur] == 0){
                    zi = cur;
                    c--;
                    z--;
                }
                c++;
                cur++;
            }
            ans = Math.max(c,ans);
            if(zi == -1){
                return ans - 1;
            }
            
            
            while(si<=cur && cur<=ei && z!=1){
                if(nums[si] == 0){
                    z = 1;
                }else{
                    c--;
                }
                si++;
            }
        }
        return ans;
    }
}