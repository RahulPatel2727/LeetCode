public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s =Integer.toString(n);
        int c = Integer.parseInt(s);
        String res=Integer.toBinaryString(c);
        int i=0;
        int t=0;
        while(i<res.length()){
            if(res.charAt(i)=='1')
                t++;
            i++;
        }
        return t;
        
    }
}