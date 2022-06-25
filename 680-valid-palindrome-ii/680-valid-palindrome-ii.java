class Solution {
    public boolean validPalindrome(String s) {
        // if(s.length()==3 && (s.charAt(0)!=s.charAt(2)))
        //     return false;
        // // if(s.length()==2 && (s.charAt(0)!=s.charAt(1)))
        //     return false;
        // if(s.length()==1)
        //     return true;
        // if(pal(s))
        //     return true;
        int st=0,en=s.length()-1;
        while(!(st>=en)){
            if(s.charAt(st)!=s.charAt(en)){
                String left=s.substring(0,st)+s.substring(st+1);
                String right=s.substring(0,en)+s.substring(en+1);
                return (pal(left)||pal(right));
            }
            st++;en--;
        }
        return true;
    }
    static boolean pal(String s){
        int st=0,en=s.length()-1;
        while(!(st>=en)){
            if(s.charAt(st)!=s.charAt(en))
                return false;
            st++;
            en--;
        }
        return true;
    } 
}