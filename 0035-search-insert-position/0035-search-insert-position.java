class Solution {
    public int searchInsert(int[] nums, int target) {
        int m = Arrays.binarySearch(nums,target);
        if(m>=0)
            return m;
        else
           return Math.abs(m)-1;
    }
}