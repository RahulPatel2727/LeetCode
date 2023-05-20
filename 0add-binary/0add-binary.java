class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int i=a.length()-1;
        int j = b.length()-1;
        int c = 0;
        while(i >= 0 || j>=0 || c==1){
            if(i>=0){
                c += a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                c += b.charAt(j) - '0';
                j--;
            }
            ans += c%2;
            c = c/2;
        }
        ans = String.valueOf(new StringBuilder().append(ans).reverse());
        return ans;
    }
}