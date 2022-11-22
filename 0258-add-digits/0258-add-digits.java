class Solution {
    public int addDigits(int num) {
        int val = num;
        while(val/10!=0){
            int sum = 0;
            while(val!=0){
                sum += val%10;
                val /= 10;
            }
            val=sum;
        }
        return val;
    }
}