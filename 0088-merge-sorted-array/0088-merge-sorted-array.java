class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j=0;
        int [] ans = new int[nums1.length];
        int it = 0;
        while(i<nums1.length - nums2.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[it] = nums1[i];
                i++;it++;
            }else{
                ans[it] = nums2[j];
                it++;j++;
            }
        }
        while(i<nums1.length - nums2.length){
            ans[it++] = nums1[i++];
        }
        while(j<nums2.length){
            ans[it++] = nums2[j++];
        }
        for(int ii=0;ii<ans.length;ii++){
            nums1[ii] = ans[ii];
        }
    }
}