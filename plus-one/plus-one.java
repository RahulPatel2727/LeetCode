class Solution {
    public int[] plusOne(int[] digits) {
        int add = 1;
        for(int i=digits.length-1;i>=0;i--){
            int t = digits[i] + add;
            digits[i] = t % 10;
            add = t / 10;
            if(add == 0){
                return digits;
            }
        }
        int [] ans = new int[digits.length+1];
        System.arraycopy(digits,0,ans,ans.length-digits.length,0);
        ans[0] = 1;
        return ans;
        
    }
}