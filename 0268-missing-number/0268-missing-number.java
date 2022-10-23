class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        int m = 0;
        for(int i:nums){
            missing = missing ^ i;
            missing = missing ^ m;
            m++;
        }
        missing ^= m;
        return missing;
    }
}