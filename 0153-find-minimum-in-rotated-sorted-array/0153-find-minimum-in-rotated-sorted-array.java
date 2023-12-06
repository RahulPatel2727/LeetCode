class Solution {
    public int findMin(int[] nums) {
        return minIndx(nums);
    }
    static int minIndx(int []arr){
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        int min = Integer.MAX_VALUE;
        while(l<=h){
            int mid = l + (h - l)/2;
            if(arr[mid]>=arr[l]){
                min = Math.min(min, arr[l]);
                l = mid + 1;
            }else{
                min = Math.min(min, arr[mid]);
                h = mid - 1;
            }
        }
        return min;
    }
}