class Solution {
    static boolean flag = false;
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        if( t.length()==0 || s.length()==0){
            return true;
        }
       
        int tLen = t.length();
        int sLen = s.length();
        int j=0;
        for(int i=0;i<tLen;i++){
            // if(sLen==j){
            //     return true;
            // }
            if(j<sLen && t.charAt(i)==s.charAt(j)){
                j++;
            }
        }
        return (j==sLen);
   }
    
}