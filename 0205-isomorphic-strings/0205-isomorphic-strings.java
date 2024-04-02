class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for (int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                Character p=map.get(s.charAt(i));
                if (p==t.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }


            }
            else{
                map.put(s.charAt(i),t.charAt(i));
                if(set.contains(t.charAt(i))){
                    return false;
                }
                else{
                    set.add(t.charAt(i));
                }

            }
        }
        return true;
    }
}