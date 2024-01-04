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
            if(v%3==0){
                c+=v/3;
            }else if(v%3==2){
                c+=v/3+1;
            }else if(v%3==1){
                c+=v/3+1;
            }else{
                c+=v/2;
            }
        }
        return c>0?c:-1;
    }
}