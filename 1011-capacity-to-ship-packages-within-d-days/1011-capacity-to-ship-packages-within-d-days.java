class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, h = 0, mid;
        for(int i:weights){
            l = Math.max(i,l);
            h += i;
        }
        // low = max of weigth and h = sum of all weights
        while(l < h){
            mid = l + (h - l)/2;
            if(isTrue(mid,weights,days)){ // if true then we goes to minimise the mid again
                h = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
        
    }
    
    
    // verifying the mid value that can port or not in <= days days
    public boolean isTrue(int mid, int[] arr,int days){
        int sum = 0, count = 1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum > mid){
                count++;
                sum = arr[i];
            }
        }
        return count<=days;
    }
}