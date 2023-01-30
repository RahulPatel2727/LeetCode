class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        int kS = kSum(nums);
        
        for(int i=0;i<nums.length;i++){
            nums[i]*=-1;
        }
        
        int nkS = kSum(nums);
        
        int res = sum + nkS;
        if(res <= 0){
            return kS;
        }
        int m = Math.max(kS,res);
        return m;
    }
    public static int kSum(int [] arr){
        int t = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            t += arr[i];
            max = Math.max(t,max);
            if(t<0){
                t = 0;
            }
            
        }
        return max;
    }
}