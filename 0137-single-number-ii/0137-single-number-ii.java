class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<32;i++){
            int o = 0;
            for(int n : nums){
                o += n>>i & 1;
            }
            o = o % 3;//  0 or 1
            ans = ans | o<<i;
        }
        return ans;
    }
}