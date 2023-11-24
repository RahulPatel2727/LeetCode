class Solution {
    public boolean isPalindrome(int x) {
        String s = ""+x;
        int si = 0, ei = s.length()-1;
        while(si<=ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }
            si++;ei--;
        }
        return true;
    }
}