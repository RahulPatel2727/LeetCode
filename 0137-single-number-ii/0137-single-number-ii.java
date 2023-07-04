class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<32;i++){
            int ones = 0;
            for(int n : nums){
                ones += (n>>i)&1;
            }
            ones = ones % 3;
            ans = ans | ones << i;
        }
        return ans;
    }
}