class Solution {
    public int longestOnes(int[] nums, int k) {
        return max(nums, k);        
    }
    static int max(int []arr, int k){
        int max = 0;
        int n = arr.length;
        int si = 0;
        int zero = 0;
        for(int cur = 0; cur<n; cur++){
            if(arr[cur] == 0){
                zero++;
            }
            while(si<=cur && zero>k){
                if(arr[si]==0){
                    zero--;
                }
                si++;
            }
            max = Math.max(max, cur - si + 1);
        }
        return max;
    }
}