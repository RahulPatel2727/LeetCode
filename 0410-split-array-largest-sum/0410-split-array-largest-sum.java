class Solution {
    public int splitArray(int[] nums, int k) {
        return splitArrayLargestSum(nums, k);
    }
    static int splitArrayLargestSum(int []arr, int k){
        int n = arr.length;
        int l = Arrays.stream(arr).max().getAsInt();
        int h = Arrays.stream(arr).sum();
        int ans = -1;
        while (l<=h) {
            int mid = l + (h-l)/2;
            if(canSplit(mid, arr, k)){
                ans = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;// or return ans;
    }
    static boolean canSplit(int mid , int []arr, int k){
        int c = 1;
        int sum = 0;
        for(int val : arr){
            sum+=val;
            if(sum>mid){
                c++;
                sum = val;
            }
            if(c > k) return false;
        }
        return c <= k;
    }
}