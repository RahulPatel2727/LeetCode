class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return max(nums);
    }
    private static int max(int []arr){
        int subArraySum=kadane(arr);
        int linearSum=0;
        for(int i:arr){
            linearSum+=i;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]*=-1;
        }
        int middleSum=kadane(arr);
        int sum = linearSum+middleSum;
        if(sum==0){
            return subArraySum;
        }
        return Math.max(sum,subArraySum);
    }
    private static int kadane(int []arr){
        int cur=0,max=Integer.MIN_VALUE;
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