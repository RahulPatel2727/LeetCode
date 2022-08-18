class Solution {
    public String reverseVowels(String s) {
        String ss = "aeiouAEIOU";
        int i=0,j=s.length()-1;
        char []str=s.toCharArray();
        while(i<=j){
            if(!ss.contains(Character.toString(str[i]))){
                i++;
            }
            else if(!ss.contains(Character.toString(str[j]))){
                j--;
            }
            else{
                char temp= str[i];
                str[i++]=str[j];
                str[j--]=temp;
            }
        }
        
        return new String(str);
    }
}