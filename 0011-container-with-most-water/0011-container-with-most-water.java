class Solution {
    public int maxArea(int[] h) {
        int max = 0;
        
        int l = 0, r = h.length-1;
        
        if(h.length==2)
            return Math.min(h[l], h[r]);
        
        while(l<r){
            int H = 0; //Math.min(h[l],h[r]);
            int L = 0; //r - l;
            if(h[l] <= h[r]){
                H = Math.min(h[l],h[r]);
                L = r - l;
                l++;
            }else{
                H = Math.min(h[l],h[r]);
                L = r - l;
                r--;
            }
            max = Math.max(max, H*L);
            // System.out.println(max +" "+H+" "+L);
        }
        return max;
    }
}