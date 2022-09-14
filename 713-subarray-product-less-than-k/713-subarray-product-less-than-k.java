class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return noOfSubArray(nums,k);
    }
    public static int noOfSubArray(int []arr,int k){
        int ans=0,si=0,ei=0,p=1;
        while(ei<arr.length){
//            window grow
            p=p*arr[ei];            
//            window shrink
            while(p>=k && si<=ei) {
                p=p/arr[si];
                si++;
            }
//            ans calculate
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}