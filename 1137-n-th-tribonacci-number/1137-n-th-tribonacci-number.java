class Solution {
    int[] memo;
    
    Solution() {
        // Initialize memo, with -1 as flags for not calculated
        memo = new int[38]; // 0 through 37
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        for(int i = 3; i < memo.length; i++){
            memo[i] = -1;
        }
    }
    
    public int tribonacci(int n) {
        // If we have already calculated value, return it.
        if(memo[n] != -1) {
            return memo[n];
        }
        else {
            int result = tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1);
            memo[n] = result;
            return result;
        }
    }
}