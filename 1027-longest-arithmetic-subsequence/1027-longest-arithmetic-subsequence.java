// class Solution {
//     public int longestArithSeqLength(int[] nums) {
//         int ans = 0;
//         HashMap<Integer, Integer> mp = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 int dif = nums[i] - nums[j];
//                 mp.put(dif, mp.getOrDefault(dif,0)+1);
//             }
//         }
//         for(Integer k : mp.keySet()){
//             ans = Math.max(ans, mp.get(k));
//         }
//         return ans + 1;
//     }
// }

class Solution {
    public int longestArithSeqLength(int[] nums) {
        int maxLength = 0;
        HashMap<Integer, Integer>[] dp = new HashMap[nums.length];
        for (int right = 0; right < nums.length; ++right) {
            dp[right] = new HashMap<>();
            for (int left = 0; left < right; ++left) {
                int diff = nums[left] - nums[right];
                dp[right].put(diff, dp[left].getOrDefault(diff, 1) + 1);
                maxLength = Math.max(maxLength, dp[right].get(diff));
            }
        }
        return maxLength;
    }
}