class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String vovel = "aeiouAEIOU";
        int a=0,b=0;
        for(int i=0;i<len;i++){
            if(i<len/2){
                if(vovel.contains(""+s.charAt(i))){
                    a++;
                }
            }
            else{
                if(vovel.contains(""+s.charAt(i))){
                    b++;
                }
            }
        }
        return a==b;
    }
}