class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        Map<String, Boolean> map = new HashMap<>(); // memoization
        return dfs(s, words, map);
    }
    
    private boolean dfs(String s, Set<String> words, Map<String, Boolean> map){
        if(map.containsKey(s)) return map.get(s);
        int len = s.length();
        if(len == 0) return true;
        
        for(int i = 1; i <= len; i++){
            if(words.contains(s.substring(0, i)) && dfs(s.substring(i), words, map)){
                map.put(s.substring(0, i), true);
                return true;   
            }
        }
        map.put(s, false);
        return false;
    }
}