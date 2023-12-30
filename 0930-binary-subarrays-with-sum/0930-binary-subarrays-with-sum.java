class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return uisingPrefixSum(nums, goal);        
    }
    static int uisingPrefixSum(int []arr, int goal){
        Map<Integer, Integer> mp = new HashMap<>();
        int ans=0;
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            int val = arr[i];
            sum += val;
            if(sum == goal){
                ans++;
            }
            int rem = sum - goal;
            if(mp.containsKey(rem)){
                ans += mp.get(rem);
            }
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
}