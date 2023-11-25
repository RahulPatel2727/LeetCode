class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int [] pre = new int[n];
        pre[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i] = nums[i]+pre[i-1];
        }
        // System.out.println(Arrays.toString(pre));
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i] = pre[n-1] - (nums[i]*n);
            }else if(i==n-1){
                ans[i] = nums[i] * (n-1) - pre[i-1];
            }else{
                int cur = nums[i];
                int l = cur * i - pre[i-1];
                int r = (pre[n-1] - pre[i]) - cur * (n-1-i);
                ans[i] = l+r;
            }
        }
        return ans;
    }
}