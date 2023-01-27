class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        Set<String> temp = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(String x : words)
            temp.add(x);
        
        
        for(String x : words){
            if(find(x, temp, map))
                ans.add(x);
        }
        
        return ans;
    }
    
    public boolean find(String s, Set<String> temp, Map<String, Integer> map){
        if(map.containsKey(s))
            return map.get(s) == 1;
        
        for(int x = 1; x < s.length(); x++){
            if(temp.contains(s.substring(0, x))){
                String str = s.substring(x);
                if(temp.contains(str) || find(str, temp, map)){
                    map.put(s, 1);
                    return true;
                }
            }
        }
        
        map.put(s, 0);
        return false;
        
    }
}