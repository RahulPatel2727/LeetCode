class Solution {
    public String reverseWords(String s) {
        String cur = "", ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                cur += s.charAt(i);
            }
            else{
                ans = ans +" "+ String.valueOf(new StringBuilder().append(cur).reverse());
                cur = "";
            }
        }
        if(cur != "")
            ans = ans +" "+ String.valueOf(new StringBuilder().append(cur).reverse());
        return ans.trim();
    }
}