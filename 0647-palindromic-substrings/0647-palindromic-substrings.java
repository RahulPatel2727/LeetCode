class Solution {
    public int countSubstrings(String s) {
        return count(s);
    }
    public static int count(String s){
        int count  = 0;
        // for odd
        for(int axis = 0; axis<s.length();axis++){
            for(int orbit=0;orbit<s.length() && axis-orbit>=0 && axis+orbit<s.length() ;orbit++){
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)){
                    break;
                }
                count++;
            }
        }

        // for even
        for(double axis = 0.5; axis<s.length();axis++){
            for(double orbit=0.5;orbit<s.length() && axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}