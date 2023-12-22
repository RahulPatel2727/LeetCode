class Solution {
    public int maxScore(String s) {
        int z = 0, o = 0;
        int ans = 0;
        for(char i : s.toCharArray()){
            if(i=='1')
                o++;
        }
        for(int it = 0;it<s.length()-1;it++){
            if(s.charAt(it) == '0'){
                z++;
            }
            else{
                o--;
            }
            ans = Math.max(ans, z+o);
        }
        return ans;
    }
}