class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int st=0,cur=0;
        while(cur < s.length()){
            char curVal = s.charAt(cur);
            if(s.substring(st,cur).contains(""+curVal)){
                while(st<=cur && cur<s.length()){
                    st++;
                    if(!s.substring(st,cur).contains(""+curVal)){
                        break;
                    }
                }
            }
            max = Math.max(max,(cur-st+1));
            cur++;
        }
        return max;
    }
}