class Solution {
    public int percentageLetter(String s, char letter) {
        int frq = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == letter){
                frq++;
            }
        }
        int len = s.length();
        return (int) Math.floor((frq*100)/len);
    }
}