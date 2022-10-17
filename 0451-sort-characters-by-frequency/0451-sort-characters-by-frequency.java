class Solution {
    public String frequencySort(String s) {
//        making a map for storing all the different character and their freqiencies
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);   
        }
        
//        making reasulting string 
        String res = "";
        while(!map.isEmpty()) {
            Character max = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            int len = map.get(max);
            for(int j=0;j<len;j++){
                res += max;
            }
            map.remove(max);
        }
        return res;
    }
}