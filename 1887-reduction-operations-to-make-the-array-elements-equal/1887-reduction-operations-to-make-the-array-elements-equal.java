class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int it : nums){
            set.add(it);
        }
        int n = nums.length;
        int sum = set.size()-1;
        int tc = 1;
        int ans = 0;
        for(int i=n-1;i>0;i--){
            if(nums[i]==nums[i-1]){
                tc++;
            }else{
                ans+= (tc*sum);
                sum--;
                tc = 1;
            }
        }
        return ans;
    }
}