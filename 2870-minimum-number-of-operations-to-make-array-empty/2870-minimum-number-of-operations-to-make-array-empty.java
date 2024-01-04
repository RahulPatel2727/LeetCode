class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int it : nums){
            mp.put(it,mp.getOrDefault(it, 0)+1);
        }
        int c = 0;
        System.out.println(mp);
        for(Integer it : mp.keySet()){
            int v = mp.get(it);
            if(v==1) return -1;
            c += Math.ceil((double) v/3);
        }
        return c;
    }
}