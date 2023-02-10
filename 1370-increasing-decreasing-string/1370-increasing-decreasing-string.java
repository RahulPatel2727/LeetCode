class Solution {
    public String sortString(String s) {
        int [] frq = new int[26];
        for(int i = 0; i<s.length();i++){
            frq[s.charAt(i)-'a']++;
        }
        int count = s.length();
        String ans = "";
        while(count!=0){
            int it1 = 0;
            while(it1<26){
                if(frq[it1]!=0){
                    ans += (char)('a'+it1);
                    frq[it1] -= 1;
                    count -= 1;
                }
                it1++;
            }
            
            int it2 = 25;
            while(it2>=0){
                if(frq[it2]!=0){
                    ans += (char)('a'+it2);
                    frq[it2]-= 1;
                    count -= 1;
                }
                it2--;
            }
        }
        return ans;   
    }
}