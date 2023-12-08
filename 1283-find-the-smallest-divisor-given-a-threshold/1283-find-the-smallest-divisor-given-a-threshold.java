class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        return solve(nums, threshold);
    }
    static int solve(int []arr, int th){
        int n = arr.length;
        int l = 1, h = Arrays.stream(arr).max().getAsInt() + 1;
        int  ans = 0;
        while(l<=h){
            int mid = l + (h - l)/2;
            if(possible(mid, arr, th)){
                ans = mid;
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return ans;
    }
    static boolean possible(int mid, int []arr, int th){
        int sum = 0;
        for(int it : arr){
            sum += Math.ceil(it/(mid*1.0));
            if(sum>th){
                return false;
            }
        }
        return true;
    }
}