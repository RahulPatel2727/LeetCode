class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        String minus="";
        if(num<0){
            minus="-";
            num=Math.abs(num);
        }
        String res = "";
        while(num!=0){
            res+=num%7;
            num/=7;
        }
        res = new StringBuilder(res).reverse().toString();
        res=minus+res;
        return res;
    }
}