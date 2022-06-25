class Solution {
    public boolean isPalindrome(String s) {
        int st=0,en=s.length()-1;
        for(int i=0;!(st>=en);i++){
            boolean b=true,c=true;
            if(!( (s.charAt(st)>=97 && s.charAt(st)<=122) || (s.charAt(st)>=48 && s.charAt(st)<=57) || (s.charAt(st)>=65 && s.charAt(st)<=90) )){
                st++;
                b=false;
            }
            if(!( (s.charAt(en)>=97 && s.charAt(en)<=122) || (s.charAt(en)>=48 && s.charAt(en)<=57) || (s.charAt(en)>=65 && s.charAt(en)<=90) )){
                en--;
                c=false;
            }
            if(b && c){
                if(!((""+s.charAt(st)).equalsIgnoreCase(""+s.charAt(en))))
                    return false;
                else{
                    st++;en--;
                }
            }
        }
        return true;
        // s=s.toLowerCase();
        // String res="";
        // for(int i=0;i<s.length();i++){
        //     if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57)){
        //         res+=s.charAt(i);
        //     }
        // }
        // int f=0;int l=res.length()-1;
        // System.out.println(res);
        // while(!(f>=l)){
        //     if(res.charAt(f)!=res.charAt(l))
        //         return false;
        //     f++;l--;
        // }
        // return true;
    }
}