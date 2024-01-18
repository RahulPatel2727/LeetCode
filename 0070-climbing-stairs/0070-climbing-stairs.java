class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2) return n;
        int []ans = new int[n];
        ans[0]=1;ans[1]=2;
        for(int i=2;i<n;i++){
            ans[i] = ans[i-1]+ans[i-2];
        }
        return ans[n-1];
    }
}