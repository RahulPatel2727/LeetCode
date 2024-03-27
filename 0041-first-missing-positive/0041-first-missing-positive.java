class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;){
            int ind = nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[ind] != nums[i]){
                int t = nums[ind];
                nums[ind] = nums[i];
                nums[i] = t;
            }else{
                i++;   
            }
        }
        // System.out.println(Arrays.toString(nums));
        int ans = 1;
        for(int val : nums){
            if(val != ans){
                return ans;
            }else{
                ans++;
            }
        }
        return ans;
    }
}