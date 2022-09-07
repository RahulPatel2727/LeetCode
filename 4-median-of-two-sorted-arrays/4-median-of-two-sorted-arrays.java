class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return find(nums1,nums2);
    }
    public static double find(int []aa, int []bb){
        int a=aa.length,b=bb.length;
        int res[]=new int[a+b];
        int m=0;
        for(int i=0;i<a+b;i++){
            if(i<a){
                res[i]=aa[i];
            }
            else{
                res[i]=bb[m++];
            }
        }
        Arrays.sort(res);
        if(res.length%2==0){
            double ss=(res[res.length/2]+res[res.length/2-1]);
            return (ss/2);
        }
        else
            return (double)(res[res.length/2]);
    }
}