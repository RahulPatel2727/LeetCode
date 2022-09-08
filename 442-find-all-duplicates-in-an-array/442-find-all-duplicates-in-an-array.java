class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[n + 1];
        for (int i : nums) {
            freq[i]++;
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                ans.add(i);
            }
        }
        return ans;
    }
}