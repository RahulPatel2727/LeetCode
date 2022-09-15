class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return noOfSubArray(nums,k);
    }
    private static int noOfSubArray(int []arr,int k){
        int si=0,prod=1;
        int res=0;
        for(int i=0;i<arr.length;){
            prod*=arr[i];
            while(prod>=k && si<=i){
                prod/=arr[si];
                si++;
            }
            res+=(i-si+1);
            i++;
        }
        return res;
    }
    
}