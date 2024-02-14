class Solution {
    public int[] rearrangeArray(int[] nums) {
        int nn = nums.length;
        int[] ans = new int[nn];
        int posIndex = 0, negIndex = 1;
        int p=0, n=0;
        for (int i = 0; i < nn; i++) {
            if (nums[i]>0) {
                ans[posIndex] = nums[i];
                posIndex += 2;
            } else {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return ans;
    }
}