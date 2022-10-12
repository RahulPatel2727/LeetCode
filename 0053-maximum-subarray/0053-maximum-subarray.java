class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubArraySum(nums);
    }
    public static int maxSubArraySum(int []arr){
        int max=Integer.MIN_VALUE;
        int cur=0;
        for(int i:arr){
            cur+=i;
            max=Math.max(cur,max);
            if(cur<0){
                cur=0;
            }
        }
        return max;
    }
}