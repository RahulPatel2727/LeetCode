class Solution {
    public int mySqrt(int x) {
        return (int)sqrt(x);
    }
    private static long sqrt(int num){
        long e=0;
        while((e*e)<=num)
            e++;
        return e-1;
    }
}