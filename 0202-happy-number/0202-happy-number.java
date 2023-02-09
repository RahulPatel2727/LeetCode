class Solution {
    public boolean isHappy(int n) {
        long ans = 0;
        long nn=n;
        int i = 1000;
        while(i-->0){
            long temp = nn;
            long sum = 0;
            while(temp!=0){
                int d = (int)temp%10;
                sum += d*d;
                temp/=10;
                // if(sum == 4)
                //     return false;
            }
            if(sum==1)
                return true;
            nn=sum;
        }
        return false;
    }
}