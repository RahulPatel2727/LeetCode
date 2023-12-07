class Solution {
    public int findPeakElement(int[] nums) {
        return peak(nums);
    }
    static int peak(int []arr){
        int n = arr.length, l = 1, h = n - 2;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;

        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid-1]<arr[mid] && arr[mid] < arr[mid+1]){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }
        return -1;
    }
}