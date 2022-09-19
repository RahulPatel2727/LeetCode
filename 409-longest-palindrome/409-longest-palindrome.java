class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        // s=s.toLowerCase();
        return check(s);
    }
    private static int check(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()==1){
            return map.get(s.charAt(0));
        }
        int one=0,res=0,odd=0,maxOdd=0;
        for(Character key:map.keySet()){
            int t=map.get(key);
            if(t==1){
                one++;
            }
            if(t%2!=0){
                odd++;
                if(t>maxOdd){
                    maxOdd=t;
                }
            }
            int temp = (t/2);
            res += (temp*2);
        }
        // if(odd==1){
        //     res ;
        // }
        if(one > 0 || odd>=1)
            res++;
        return res;
    }
    // private static boolean isPal(String s , int si, int ei){
    //     while(si<=ei){
    //         if(s.charAt(si)!=s.charAt(ei)){
    //             return false;
    //         }
    //         si++;ei--;
    //     }
    //     return true;
    // }
}