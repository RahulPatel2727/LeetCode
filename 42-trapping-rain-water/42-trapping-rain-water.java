class Solution {
    public int trap(int[] height) {
        int [] left=new int[height.length];
        int [] right=new int[height.length];
        int res=0;
        int len=height.length;
        left[0]=height[0];
        right[len-1]=height[len-1];
        for(int i=1,j=len-2;i<len && j>=0;i++,j--){
            left[i]=Math.max(height[i],left[i-1]);
            right[j]=Math.max(height[j],right[j+1]);
        }
        for(int i=0;i<height.length;i++){
            res+=Math.min(left[i],right[i])-height[i];
        }
        return res;
    }
}