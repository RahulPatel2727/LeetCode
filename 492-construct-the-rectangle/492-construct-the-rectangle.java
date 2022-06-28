class Solution {
    public int[] constructRectangle(int area) {
        int w=(int)Math.sqrt(area);
        for(;w>=1;w--){
            if(area%w==0){
                return new int[]{Math.max(w,area/w),Math.min(w,area/w)};
            }
        }
        return new int[]{area,1};
    }
}