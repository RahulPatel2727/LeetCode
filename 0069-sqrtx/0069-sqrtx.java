class Solution {
    public int mySqrt(int x) {
        int low = 1, hi = x;
        int mid ;
        while(low<=hi){
            mid = low + (hi - low)/2;
            if(mid == x/mid){
                return mid;
            }
            if(mid>x/mid){
                hi=mid-1;
            }
            else if(mid<x/mid){
                low = mid+1;
            }
        }
        
        return hi;
    }
}