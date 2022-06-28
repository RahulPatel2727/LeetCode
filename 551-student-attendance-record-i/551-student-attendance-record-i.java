class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=1;boolean f1=false,f2=false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='A'){
                f1=true;
                a++;
                if(a>2){
                    return false;
                }
            }
            else if((s.charAt(i)==s.charAt(i+1)) && s.charAt(i)=='L'){
                l++;
                if(l>=3)
                    return false;
            }
            else{
                l=1;
            }
        }
        if(s.charAt(s.length()-1)=='A')
            a++;
        if(a>=2)
            return false;
        else
            return true;
    }
}