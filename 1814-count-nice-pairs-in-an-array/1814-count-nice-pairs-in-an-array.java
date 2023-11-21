class Solution {
    public int countNicePairs(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] - rev(nums[i]);
        }
        // System.out.println(Arrays.toString(arr));
        Map<Integer, Integer> dic = new HashMap();
        int ans = 0;
        int MOD = (int) 1e9 + 7;
        
        for (int num : arr) {
            int val = dic.getOrDefault(num, 0);
            // System.out.println(val);
            ans = (ans + val) % MOD;
            dic.put(num, dic.getOrDefault(num, 0) + 1);
        }
        // System.out.println(dic);
        return ans;
    }
    
    public static int rev(int num) {
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        
        return result;
    }
}