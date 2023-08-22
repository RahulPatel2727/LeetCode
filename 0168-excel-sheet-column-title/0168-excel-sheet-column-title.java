class Solution {
    public String convertToTitle(int n) {
        String ans = "";
        while(n > 0){
            n--;
            ans += (char)(n % 26 + 'A');
            n = n / 26;
        }
        ans = reverse(ans.toCharArray());
        return ans;
    }
    public static String reverse(char [] arr){
        int si = 0, ei = arr.length - 1;
        while(si<ei){
            char t = arr[si];
            arr[si] = arr[ei];
            arr[ei] = t;
            si++; ei--;
        }
        return new String(arr);
    }
}