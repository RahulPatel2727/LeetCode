class Solution {
    public int reverse(int x) {
        int mul = 1;
        if(x<0)
            mul = -1;
        x=Math.abs(x);
        long res = 0;
        while(x!=0){
            res = res*10 + x%10;
            if(res <= -2147483648 || res >= 2147483647)
                return 0;
            x/=10;
        }
        return (int)res*mul;
    }
}