class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int it =0;
        int [][]ans = new int[n/3][3];
        int [][]none = new int[0][1];
        for(int i=0;i<n-2;i+=3){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];
            if(c-a>k) return none;
            ans[it][0] = a;
            ans[it][1] = b;
            ans[it][2] = c;
            it++;
            
        }
        return ans;
    }
}