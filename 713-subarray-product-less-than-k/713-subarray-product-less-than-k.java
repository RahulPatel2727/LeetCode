class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return noOfSubArray(nums,k);
    }
    private static int noOfSubArray(int []arr,int k){
        int si=0,ei=0,res=0;
        int product=1;
        for(ei=0;ei<arr.length;ei++){
            product*=arr[ei];
            while(product>=k && si<=ei){
                product/=arr[si];
                si++;
            }
            res+=ei-si+1;
            // ei++;
        }
        return res;
    }
    
}