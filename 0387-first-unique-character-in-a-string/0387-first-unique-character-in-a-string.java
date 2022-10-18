class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        int []frq =new int[26];
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            frq[ch-'a']++;
        }
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(frq[ch -'a']==1){
                return i;
            }
        }
        return -1;
    }
}