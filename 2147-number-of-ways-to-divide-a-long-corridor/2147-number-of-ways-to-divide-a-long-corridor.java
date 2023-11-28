class Solution {
    public static int mod = 1000000007;
    public int numberOfWays(String s) {
        int n = s.length();
        int ei = n-1;
        while(ei>=0){
            if(s.charAt(ei) == 'P'){
                n--;
            }else{
                break;
            }
            ei--;
        }
        // System.out.println(n);
        int pc = 0;
        int sc = 0, tsc=0;
        long ans = 1;
        for (int i = 0; i < n; ) {
            while (i < n && sc < 2) {
                if (s.charAt(i) == 'S') {
                    sc++; tsc++;
                }
                i++;
            }

            while(i<n && s.charAt(i)=='P'){
                i++; pc++;
            }
            
            if(pc>0){
                ans = (ans * (pc+1)) % mod;
                pc = 0;
            }
            if(sc==2){
                sc = 0;
            }

        }
        if(tsc%2!=0 || n==0){
            return 0;
        }
        if(tsc==2){
            return 1;
        }
        return (int) ans;
    }
}