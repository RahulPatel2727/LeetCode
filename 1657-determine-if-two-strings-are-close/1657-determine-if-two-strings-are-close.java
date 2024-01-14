class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        
        int []f1 = new int[26];
        int []f2 = new int[26];
        Set<Character> set = new HashSet<>();

        for(char ch : word1.toCharArray()) {
            f1[ch-'a']++;
            set.add(ch);
        }
        for(char ch : word2.toCharArray()) {
            if(set.contains(ch)){
                set.remove(ch);
            }
            f2[ch-'a']++;
        }
        if(set.size()>0){
            return false;
        }
        Map<Integer, Integer>mp = new HashMap<>();
        for(int it : f1){
            mp.put(it, mp.getOrDefault(it, 0)+1);
        }
        for(int it : f2){
            if(!mp.containsKey(it)) return false;
            else{
                mp.put(it, mp.get(it)-1);
            }
            if(mp.get(it)==0) mp.remove(it);
        }
        // System.out.println(mp);

        return mp.size()==0;
    }
}