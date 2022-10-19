class Solution {
    public int[] frequencySort(int [] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // sort the map O(n * logn)
        Collections.sort(ans, (a, b) -> {               
            return map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b);
        });
        // return ans.stream().mapToInt(i -> i).toArray();
        int [] res = new int[ans.size()];
        int i=0;
        for(Integer it: ans){
            res[i++]=it;
        }
        return res;
    }
}