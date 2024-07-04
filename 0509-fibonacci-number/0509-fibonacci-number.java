class Solution {
    public int fib(int n) {
        if(n==1) return n;
        int z = 0, f = 1;
        int res = 0;
        for(int i=2;i<=n;i++){
            res = z + f;
            z = f;
            f = res;
        }
        return res;
    }
}