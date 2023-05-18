class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
                ans = i;
            }
        }
        System.out.println(max+" "+ans);
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] == max){
                continue;
            } 
            if(max < (2 * nums[i])){
                return -1;
            }
        }
        return ans;
    }
}