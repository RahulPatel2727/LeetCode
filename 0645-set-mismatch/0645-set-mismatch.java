class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                duplicate=nums[i];
            }
            sum += nums[i];
        }
        sum += nums[n-1];
        // System.out.println(sum);
        sum = sum - duplicate;
        int total = (n*(n+1))/2;
        missing = total - sum;
        return new int[]{duplicate,missing};
        
    }
}