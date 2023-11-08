class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int h = Math.abs(sy-fy);
        int w = Math.abs(sx-fx);
        if(w==0 && h==0 && t==1)
            return false;
        return t>=Math.max(h,w);
    }
}