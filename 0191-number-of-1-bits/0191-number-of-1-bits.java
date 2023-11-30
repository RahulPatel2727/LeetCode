public class Solution {
    // you need to treat n as an unsigned value
   public static int hammingWeight(int n) {
	int o = 0;
    	while(n!=0) {
    		o = o + (n & 1);
    		n = n>>>1;// for unsigned shifting of bits
    	}
    	return o;
}
}