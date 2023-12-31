class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }
    static int atMost(int []arr, int k){
        int n = arr.length;
        int si = 0; int count = 0;
        Set<Integer> set = new HashSet<>();
        int []frq = new int[n+1];
        for(int cur = 0; cur<n; cur++){
            int element = arr[cur];
            int ind = (element - '0' + 48);
            frq[ind]++;
            // if(set.isEmpty() || !set.contains(element)) set.add(element);
            set.add(element);
            if(set.size()<=k){
                count += cur - si + 1;
            }
            while(si<=cur && set.size() > k){
                element = arr[si];
                ind = (element - '0' + 48);
                frq[ind]--;
                si++;
                if(frq[ind]==0){
                    set.remove(element);
                }
                if(set.size()<=k){
                    count += cur - si + 1;
                }
            }
        }
        return count;
    }
}