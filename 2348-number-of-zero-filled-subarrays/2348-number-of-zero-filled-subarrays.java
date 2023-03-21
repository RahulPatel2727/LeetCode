class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long zc = 0;
        for(int it = 0; it < nums.length; it ++){
            if(nums[it] == 0){
                zc++;
            }
            else{
                zc = 0;
            }
            ans += zc;
        }
        // ans += (zc*(zc+1))/2;
        return ans;
    }
}