class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;
        int sum = 0;
        for(int i=digits.length-1; i>=0;i--){
            sum = c + digits[i];
            digits[i] = sum % 10;
            c = sum / 10;
        }
        if(c == 0)
            return digits;
        int [] ans = new int[digits.length+1];
        System.arraycopy(digits, 0, ans, 1, digits.length);
        ans[0] = c;
        return ans;
    }
}