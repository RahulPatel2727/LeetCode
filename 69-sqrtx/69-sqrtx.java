class Solution {
    public int mySqrt(int x) {
        return sqrt(x);
    }
    private static int sqrt(int num){
        if(num==0 || num==1)
            return num;
        int s=0,e=num;
        int mid=s+(e-s)/2;
        while(s<=e){
            
            if(mid==num/mid)
                return mid;
            else if(mid > num / mid){
                e=mid-1;
                mid=s+(e-s)/2;
            }
            else{
                s=mid+1;
                mid=s+(e-s)/2;
            }
        }
        return e;
    }
}