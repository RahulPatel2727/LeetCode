class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long zc = 0;
        for(int it = 0; it < nums.length; it ++){
            while(it<nums.length && nums[it] == 0){
                zc++; it++;
            }
            ans += (zc*(zc+1))/2;
            zc = 0;
        }
        ans += (zc*(zc+1))/2;
        return ans;
    }
}