class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;int si=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ei = 0; ei<fruits.length; ei++){
            map.put(fruits[ei],map.getOrDefault(fruits[ei],0) + 1);
            while(map.size()>2){
                map.put(fruits[si],map.get(fruits[si])-1);
                if(map.get(fruits[si])==0){
                    map.remove(fruits[si]);
                }
                si++;
            }
            max = Math.max(max, ei-si+1);
        }
        return max;
    }
}