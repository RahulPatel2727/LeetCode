class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        nums = find(nums,k);
        return nums;
    }
    public static int [] find(int [] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int [] el = new int[map.size()];
        int [] frq = new int[map.size()];
        int i = 0;
        for(Map.Entry<Integer,Integer> mp : map.entrySet()) {
            el[i]=mp.getKey();
            frq[i]=mp.getValue();
            i++;
        }
        for(int j = 0; j<el.length;j++){
            for(int m = j+1;m<el.length;m++){
                if(frq[j]>frq[m]){
                    int t = frq[j];
                    frq[j] = frq[m];
                    frq[m] = t;
                    int tt = el[j];
                    el[j] = el[m];
                    el[m] = tt;
                }
            }
        }
        int len = el.length-1;
        int st = 0;
        int [] ans = new int[k];
        while(k-->0){
            ans[st] = el[len];
            st++;
            len--;
        }
        return ans;
    }
}