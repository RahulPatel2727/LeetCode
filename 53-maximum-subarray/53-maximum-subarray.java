class Solution {
    public int maxSubArray(int[] nums) {
        return maxSum(nums);
    }
    public static int maxSum(int []arr){
        int ans=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            ans=Math.max(cur,ans);
            if(cur<0){
                cur=0;
                // i++;
            }
        }
        return ans;
    }
}