class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int t : nums1){
            set.add(t);
        }
        for(int i:nums2){
            if(set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}