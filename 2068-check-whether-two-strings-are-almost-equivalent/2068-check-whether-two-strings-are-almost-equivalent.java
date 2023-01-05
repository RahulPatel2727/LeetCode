class Solution {
    public boolean checkAlmostEquivalent(String w1, String w2) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<w1.length();i++){
            char ch = w1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<w2.length(); i++){
            char ch = w2.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        // System.out.println(map);
        for(int i:map.values()){
            i = Math.abs(i);
            if(i>3){
                return false;
            }
        }
        return true;
    }
}