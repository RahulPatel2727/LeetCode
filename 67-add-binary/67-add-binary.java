class Solution {
    public String addBinary(String a, String b) {
        String res="";
        String small=(a.length()<b.length())?a:b;
        String big=(a.equals(small))?b:a;
        int carry=0;
        for(int i=small.length()-1 , j=big.length()-1;i>=0 ;i--,j--){
            int m=Character.getNumericValue(small.charAt(i));
            int n=Character.getNumericValue(big.charAt(j));
            res+=(carry+m+n)%2;
            carry=(carry+m+n)/2;
        }
        for(int i= big.length()-small.length()-1;i>=0;i--){
            int m=Character.getNumericValue(big.charAt(i));
            res+=(carry+m)%2;
            carry=(carry+m)/2;
        }
        if(carry==1)
            res+=carry;
        
        return String.valueOf(new StringBuilder().append(res).reverse());
    }
}