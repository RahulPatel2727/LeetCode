class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // return isAnagram1(s,t);
        return isAnagram2(s,t);
    }
    // method 1 using frequency
    public static boolean isAnagram1(String a,String b){
        int [] f1 = new int[26];
        int [] f2 = new int[26];
        for(int i=0;i<a.length();i++){
            f1[a.charAt(i)-'a']++;
            f2[b.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }
    
    // method 2 short the words
    public static boolean isAnagram2(String a, String b){
        char [] ch = a.toCharArray();
        Arrays.sort(ch);
        String aa = String.valueOf(ch);
        ch = b.toCharArray();
        Arrays.sort(ch);
        String bb = String.valueOf(ch);
        return aa.equals(bb);
    }
}