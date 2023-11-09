class Solution {
    static int mod = 1000000007;
    public int countHomogenous(String s) {
        int sum = 0;
        
        for(int cur = 0; cur < s.length(); cur++){
            int c = 1;
            while(cur < s.length()-1 && s.charAt(cur)==s.charAt(cur+1)){
                cur++;
                c++;
            }
            sum = (sum + sum(c)) % mod;
        }
        return sum;
        
    }
    static int sum(int n){
        int sum = 0;
        while(n>0){
            sum = (sum + n--)%mod;
        }
        return sum;
    }
}