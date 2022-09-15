class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return noOfSubArray(nums,k);
    }
    private static int noOfSubArray(int []arr,int k){
        int total=0;
        int si=0;
        int p=1;
        for(int i=0;i<arr.length;i++){
            p*=arr[i];
            while(p>=k && si<=i){
                p/=arr[si];
                si++;
            }
            total+=i-si+1;
        }
        return total;
    }
    
}