class Solution {
    public String reverseWords(String s) {
        String t = new StringBuilder(s).reverse().toString();
        String []arr=t.split(" ");
        String res="";
        reverse(0,arr.length-1,arr);
        for(String sss:arr)
            res+=sss+" ";
        return res.trim();
    }
    private static void reverse(int si,int ei , String []a){
        while(si<=ei){
            String c = a[si];
            a[si]=a[ei];
            a[ei]=c;
            si++;ei--;
        }
    }
}