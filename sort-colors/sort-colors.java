class Solution {
    public void sortColors(int[] nums) {
        int [] ans = countingSort(nums);
        for(int i=0; i<nums.length; i++){
            nums[i] = ans[i];
        }
    }
    public static int [] countingSort(int [] nums){
        int [] frq = new int[3];
        for(int i : nums){
            frq[i]++;
        }
        
        for(int i=1;i<3;i++){
            frq[i] = frq[i] + frq[i-1];
        }
        
        int [] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[frq[nums[i]]-1] = nums[i];
            frq[nums[i]] -= 1;
        }
        return Arrays.copyOf(ans, ans.length);
    }
}