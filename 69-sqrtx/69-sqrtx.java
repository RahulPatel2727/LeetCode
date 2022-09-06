class Solution {
    public int mySqrt(int x) {
        return sqrt(x);
    }
    private static int sqrt(int num){
        if(num==0 || num==1)
            return num;
        int s=0,e=num;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid==num/mid)
                return mid;
            else if(mid > num / mid){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            // s++;e--;
        }
        return e;
    }
}