class Solution {
    public int fib(int n) {
        return fibo(n);
    }
    public static int fibo(int n){
        if(n<=1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}