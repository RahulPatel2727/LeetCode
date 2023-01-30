class Solution {
    int [] memo;
    public int tribonacci(int n) {
        memo = new int[38]; // 0 through 37
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        for(int i = 3; i < memo.length; i++){
            memo[i] = -1;
        }
        return tf(n, memo);
    }
    public static int tf(int n , int [] memo){
        if(memo[n] != -1){
            return memo[n];
        }
        else{
            int ans = tf(n-1, memo)+tf(n-2, memo)+tf(n-3, memo);
            memo[n] = ans;
            return ans;
        }
    }
}