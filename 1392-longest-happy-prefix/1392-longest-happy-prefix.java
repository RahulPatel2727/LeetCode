class Solution {
    public String longestPrefix(String s) {
    int i=1;
    int prev=0;
    int n=s.length();
    int[] lps= new int[n];
    lps[0]=0;
    while(i < n){
        char c1=s.charAt(i);
        char c2=s.charAt(prev);
        if(c1==c2){
            lps[i]=prev+1;
            i+=1; prev+=1;

        }else if(prev==0){
                lps[i]=0;
                i+=1;
        }else{
            prev=lps[prev-1];
        }
    }  
    int end=lps[n-1];
    return s.substring(0,end);
    }
}