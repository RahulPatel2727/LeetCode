class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int it:arr){
            mp.put(it, mp.getOrDefault(it,0)+1);
        }
        // System.out.println(mp);
        int itr = 0;
        arr = new int[mp.size()];
        for(Integer key : mp.keySet()){
            arr[itr] = mp.get(key);
            itr++;
        }
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int c = arr.length;
        for(int it : arr){
            if(k>=it){
                k -= it;
                c--;
            }
        }
        return c;
    }
}