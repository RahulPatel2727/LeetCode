class Solution {
    public int minSteps(String s, String t) {
        int []ft = new int[26];
        for(char ch : t.toCharArray()){
            ft[ch-'a']++;
        }
        int req = 0;
        for(char ch : s.toCharArray()){
            if(ft[ch-'a']==0){
                req++;
            }else{
                ft[ch-'a']--;
            }
        }
        return req;
    }
}