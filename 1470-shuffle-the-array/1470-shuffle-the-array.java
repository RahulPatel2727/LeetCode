class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int[nums.length];
        int y = n;int it=0;
        for(int x = 0; x < n; x++){
            ans[it++]=nums[x];//x1...Xn
            ans[it++]=nums[y];//y1...Yn
            y++;
        }
        // System.out.println(n);
        return ans;
    }
}