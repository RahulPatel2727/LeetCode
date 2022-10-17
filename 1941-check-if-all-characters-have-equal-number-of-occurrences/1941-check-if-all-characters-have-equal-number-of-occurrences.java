class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer>mp = new HashMap<>();
        for(int i =0;i<s.length();i++){
             mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int temp = mp.get(s.charAt(0));
        for (Integer val : mp.values()){
            if(temp != val){
                return false;
            }
        }  
        return true;
    }
}