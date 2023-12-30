class Solution {
    public boolean makeEqual(String[] words) {
        int []frq = new int[26];
        int l = words.length;
        for(String str : words){
            for(char ch : str.toCharArray()){
                frq[ch-'a']++;
            }
        }
        for(int fq : frq){
            if(fq % l != 0){
                return false;
            }
        }
        return true;
    }
}