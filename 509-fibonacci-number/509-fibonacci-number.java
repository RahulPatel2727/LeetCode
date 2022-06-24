class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
        int res=1,b=0;
        for(int i=2;i<=n;i++){
            res=res+b;
            b=res-b;
        }
        return res;
    }
    // public static int fibo(int n){
    //     if(n<=1)
    //         return n;
    //     return fibo(n-1)+fibo(n-2);
    // }
}