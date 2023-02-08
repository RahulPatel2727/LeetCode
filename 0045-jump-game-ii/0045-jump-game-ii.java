class Solution {
    public int jump(int[] nums) {
        int si=1, count = 0, en = nums[0];
        while(si<nums.length){
             if(en>=nums.length){
                return count+1;
            }
            int max = en;
            while(si<nums.length && si<=en){
                max = Math.max(max,nums[si]+si);
                si++;
            }
            en = max;
            count++;
        }
        return count++;
    }
}