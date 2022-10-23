class Solution {
    public char findTheDifference(String s, String t) {
        char dif = 'a'^'a';
        for(int i =0; i<s.length();i++){
            dif ^= s.charAt(i);
            dif ^= t.charAt(i);
        }
        dif ^= t.charAt(t.length()-1);
        return dif;
    }
}