class Solution {
    public String firstPalindrome(String[] words) {
        boolean f=false;
        for(int i=0;i<words.length;i++){
            int left=0,right=words[i].length()-1;boolean flag=true;
            while(!(left>=right)){
                if(words[i].charAt(left)!=words[i].charAt(right)){
                    flag=false;
                    break;
                }
                left++;
                right--;
            }
            if(flag==true)
                return words[i];
        }
        return "";
    }
}