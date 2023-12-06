class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        // n = n/7;
        int a = 1;
        while(n>0){
            if(n>7){
                n = n - 7;
                ans += ((a + a+6) * 7) /2;
                a++;
            }else{
                ans += ((a + a+n-1) * n) /2;
                break;
            }
        }
        // System.out.println(a);
        return ans;
    }
}