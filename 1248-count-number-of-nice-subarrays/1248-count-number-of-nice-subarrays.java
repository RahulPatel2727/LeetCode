class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countKOddWindow(nums, k);
    }
    static int countKOddWindow(int []arr, int k){
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int ans = 0;
        int si = 0;
        for(int cur = 0; cur<n; cur++){
            if(arr[cur] % 2 != 0){
                sum++;
            }
            if(sum == k){
                ans++;
            }
            int req = sum - k;
            if(mp.containsKey(req)){
                ans += mp.get(req);
            }
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }
        // System.out.println(mp);
        return ans;
    }
}