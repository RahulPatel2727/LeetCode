class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMostK(nums, goal) - atMostK(nums, goal-1);
    }
    static int atMostK(int []arr, int goal){
        int ans = 0;
        int curSum = 0;
        int si = 0;
        for(int cur = 0; cur<arr.length; cur++){
            curSum += arr[cur];
            if(curSum<=goal){
                ans += cur - si + 1;
            }
            while(si<=cur && curSum > goal){
                curSum -= arr[si];
                si++;
                if(curSum<=goal){
                    ans += cur - si + 1;
                }
            }
        }
        return ans;
    }
}