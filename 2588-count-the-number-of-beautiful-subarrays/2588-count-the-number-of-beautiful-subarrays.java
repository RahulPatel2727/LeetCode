class Solution {
    public long beautifulSubarrays(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        int prefixXOR = 0;long beautifulCount = 0;
        for (int i = 0; i < n; i++) {
            prefixXOR ^= nums[i];
            int count = freq.getOrDefault(prefixXOR, 0);
            beautifulCount += count;
            // for (int k = 0; k < 20; k++) {
            //     int mask = (1 << k);
            //     int complement = prefixXOR ^ mask;
            //     if (freq.containsKey(complement)) {
            //         beautifulCount += freq.get(complement);
            //     }
            // }
            freq.put(prefixXOR, count + 1);
        }
        return beautifulCount;
    }
        // HashMap<Integer, Integer> dp = new HashMap<>();
        // dp.put(0, 1);
        // int pre = 0;
        // long res = 0;
        // for (int a : A) {
        //     pre ^= a;
        //     int v = dp.getOrDefault(pre, 0);
        //     res += v;
        //     dp.put(pre, v + 1);
        // }
        // return res;
}