class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k-1);
    }
    // frq array is better than map acc to time complexity but for space map is better
    static int atmost(int []arr, int k){
        int n = arr.length;
        int si = 0; int count = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        // int []frq = new int[n+1];
        for(int cur = 0; cur<n; cur++){
            int element = arr[cur];
            // int ind = (element - '0' + 48);
            // frq[ind]++;
            mp.put(element, mp.getOrDefault(element, 0) + 1);
            if(mp.size()<=k){
                count += cur - si + 1;
            }
            while(si<=cur && mp.size() > k){
                element = arr[si];
                // ind = (element - '0' + 48);
                mp.put(element,  mp.get(element)-1);
                si++;
                if(mp.get(element)==0){
                    mp.remove(element);
                }
                if(mp.size()<=k){
                    count += cur - si + 1;
                }
            }
        }
        return count;
    }
}