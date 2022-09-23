class Solution {
    public int concatenatedBinary(int n) {
        return dec(n);
    }
    public static int dec(int n ){
        final long modulo = (long) (1e9 + 7);
        long res = 0;
        for(int i=1;i<=n;i++){
            int temp = i;
            while(temp>0){
                temp/=2;
                res*=2;
            }
            res=(res+i)%modulo;
        }
        return (int)res;
    }
}