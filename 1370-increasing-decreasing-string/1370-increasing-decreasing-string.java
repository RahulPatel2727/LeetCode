class Solution {
    public String sortString(String s) {
        int [] frq = new int[26];
        for(int i = 0; i<s.length();i++){
            frq[s.charAt(i)-'a']++;
        }
        int count = s.length();
        int i=0;String ans = "";
        while(count!=0){
            int it;
            if(i%2==0){
                it = 0;
                while(it<26){
                    if(frq[it]!=0){
                        ans += (char)('a' + it);
                        frq[it]-=1;
                        count-=1;
                    }
                    it++;
                }
            }else{
                it = 25;
                while(it>=0){
                    if(frq[it]!=0){
                        ans += (char)('a' + it);
                        frq[it]-=1;
                        count-=1;
                    }
                    it--;
                }
            }
            i++;
        }
        return ans;   
    }
}