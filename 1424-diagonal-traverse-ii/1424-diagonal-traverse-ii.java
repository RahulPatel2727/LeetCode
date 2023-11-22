class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int n = 0;
        for(int i=nums.size()-1;i>=0;i--){
            n+=nums.get(i).size();
            
            for(int j=0;j<nums.get(i).size();j++){
                int key = i+j;
                List<Integer> val = mp.getOrDefault(key, new ArrayList<>());
                val.add(nums.get(i).get(j));
                mp.put(key, val);
            }
        }
        
        
        int [] ans = new int[n];
        int key = 0, itr = 0;
        while(mp.containsKey(key)){
            for(int it : mp.get(key++)){
                ans[itr++] = it;
            }
        }
        return ans;
    }
}