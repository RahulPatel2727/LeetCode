class Solution {
    public int characterReplacement(String s, int k) {
        return longest(s, k);        
    }
    static int longest(String s, int k){
        int n = s.length();
        int []frq = new int[26];
        int si = 0; 
        int maxFrq = 0, maxLen=0;
        int sum = 0;
        for(int cur = 0; cur<n; cur ++){
            char curChar = s.charAt(cur);
            frq[curChar-'A']++;
            sum++;
            maxFrq = Math.max(maxFrq, frq[curChar-'A']);
            while(si<=cur && (sum-maxFrq)>k){
                frq[s.charAt(si)-'A']--;
                sum--;
                si++;
            }
            maxLen = Math.max(maxLen, sum);// (cur-si+1) or sum
        }
        return maxLen;
    }
}