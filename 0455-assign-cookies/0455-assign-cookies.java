class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int it = s.length - 1;
        int c=0;
        for(int i = g.length-1; i>=0; i--){
            if(s[it]>=g[i]){
                c++;it--;
            }
            if(it<0) return c;
        }
        return c;
    }
}