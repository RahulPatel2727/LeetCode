class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        String res="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57)){
                res+=s.charAt(i);
            }
        }
        
        int f=0;int l=res.length()-1;
        System.out.println(res);
        while(!(f>=l)){
            if(res.charAt(f)!=res.charAt(l))
                return false;
            f++;l--;
        }
        return true;
    }
}