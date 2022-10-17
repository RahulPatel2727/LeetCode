class Solution {
    public boolean checkIfPangram(String sentence) {
        int []frq = new int[26];
        for(int i = 0; i < sentence.length(); i++){
            frq[sentence.charAt(i)-'a']++;
        }
        for(int i =0;i<26;i++){
            if(frq[i]==0){
                return false;
            }
        }
        return true;
    }
}