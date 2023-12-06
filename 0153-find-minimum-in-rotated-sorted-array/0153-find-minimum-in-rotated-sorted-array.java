class Solution {
    public int findMin(int[] nums) {
        return minIndx(nums);
    }
    static int minIndx(int []arr){
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        while(l<h){
            int mid = l + (h - l)/2;
            if(arr[mid]<=arr[n-1]){
                h = mid;
            }else{
                l = mid + 1;
            }
        }
        return arr[l];
    }
}