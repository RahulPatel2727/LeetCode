class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] arr = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if(arr.length!=pattern.length())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (!map.containsKey(ch) ){
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(ch,arr[i]);
            }
            else if(map.containsKey(ch) && !map.get(ch).equals(arr[i])){
                return false;
            }
        }
        return true; 
    }
}