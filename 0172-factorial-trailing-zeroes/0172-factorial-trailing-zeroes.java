class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n>4){
            int i = 5;
            count += n/i;
            n=n/i;
            i*=i;
        }
        return count;
    }
}