class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, h = 0, mid;
        for(int it : weights){
            h += it;
            l = Math.max(l,it);
        }
        while(l < h){
            mid = l + (h - l)/2;
            if(is(mid, weights, days)){
                h = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
    public boolean is(int mid, int [] arr, int days){
        int c = 1, sum = 0;
        for(int it : arr){
            sum += it;
            if(sum > mid){
                sum = it;
                c++;
            }
        }
        return c<=days;
    }
}