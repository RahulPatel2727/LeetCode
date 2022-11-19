public class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            long si=0,ei=(long)Math.sqrt(c);
            while(si<=ei){
                long mid = si+(ei-si)/2;
                if((a*a+mid*mid)==c){
                    return true;
                }
                else if((a*a+mid*mid)>c){
                    ei=mid-1;
                }
                else{
                    si=mid+1;
                }
            }
        }
        return false;
    }
}