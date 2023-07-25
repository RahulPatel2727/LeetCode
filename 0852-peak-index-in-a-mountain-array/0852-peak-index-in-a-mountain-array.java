class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int si = 0, ei = n-1;
        while(si < ei){
            int mid = si + (ei - si) / 2;
            if(arr[mid]<arr[mid+1]){
                si = mid + 1;
            }
            else{
                ei = mid;
            }
        }
        return si;
    }
}