class Solution {
    public int[] groupStrings(String[] words) {
        // time -> 26*26*O(N)  space -> 2*O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(String word: words){
            int bitmask = 0;
            for(char ch: word.toCharArray()){
                bitmask |= (1 << (ch - 'a'));
            }
            map.put( bitmask, map.getOrDefault(bitmask, 0) + 1 );
        }
        
        List<Integer> keyset = new ArrayList<>();
        for(Integer key : map.keySet()){
            keyset.add(key);
        }
        
        int total_groups = 0, max_size = 0;
        
        for(Integer key: keyset){
            if(!map.containsKey(key)) continue;
            
            total_groups++;
            int size = dfs(key, map);
            max_size = Math.max(size, max_size);
        }
        
        return new int[]{total_groups, max_size};
    }
    
    private int dfs(Integer key, HashMap<Integer, Integer> map){
        
        if(!map.containsKey(key)){
            return 0;
        }
        
        int size = map.get(key);
        map.remove(key);
        // toggling the bits -> both addition and deletion operation
        for(int i = 0; i < 26; i++){
            size += dfs( (key ^ (1 << i)), map );
        }
        
        // doing the replacing operation -> replacing each set bit with every unset bit
        for(int i = 0; i < 26; i++){
            if( (key & (1 << i)) > 0 ){ // means ith bit is 1(set)
                
                for(int j = 0; j < 26; j++){
                    if( (key & (1 << j)) == 0 ){ // means jth bit is 0(not set)
                        
                        size += dfs( (key ^ (1 << i) ^ (1 << j)), map );
                    }
                }
            }
        }
        
        return size;
    }
}