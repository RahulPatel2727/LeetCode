class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int max = 0;
        int res = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int v = entry.getValue();
            if(max<v){
                max = v;
                res=entry.getKey();
            }
        }
        
        return res;
    }
}