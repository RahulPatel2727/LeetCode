class Solution {
    public int commonFactors(int a, int b) {
        int c = 0;
        int min=(a>b)?a:b;
        int i=1;
        while(i<=min){
            if(a%i==0 && b%i==0){
                c++;
            }
            i++;
        }
        return c;
    }
}