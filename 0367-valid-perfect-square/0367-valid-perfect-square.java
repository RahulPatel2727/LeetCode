class Solution {
    public boolean isPerfectSquare(int num) {
        long si=0,ei=num;
        while(si<=ei){
            long mid = si+(ei-si)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid>num){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return false;
    }
}