class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        Map<Integer, Integer>mp = new HashMap<>();
        for(int it : nums){
            mp.put(it, mp.getOrDefault(it,0)+1);
        }
        List<Integer> ls = new ArrayList<>();
        for(Integer it : mp.keySet()){
            if(mp.get(it)>n){
                ls.add(it);
            }
        }
        return ls;
    }
}