class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        if(len == 1)
            return 0;
        boolean []vis =new boolean[26];
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(!vis[ch-'a']){
                vis[ch-'a']=true;
                String t = s.substring(i+1);
                if(t.indexOf(ch) == -1){
                    return i;
                }
            }
        }
        return -1;
    }
}