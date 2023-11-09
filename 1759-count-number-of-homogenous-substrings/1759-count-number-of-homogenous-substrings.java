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
            // System.out.println(c);
            if(cur==s.length() && s.charAt(s.length()-2)==s.charAt(s.length()-1)){
                c = c + 1;
            }
            sum = (sum + sum(c)) % mod;
            // System.out.println(sum(c));
        }
        // if(s.charAt(s.length()-2)!=s.charAt(s.length()-1)){
        //     sum = (sum + 1);
        //     System.out.println("IF");
        // }
        
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