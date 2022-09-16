class Solution {
    public int search(int[] nums, int target) {
        return bSearch(nums,target);
    }
    private static int bSearch(int []arr,int val){
        int max=0,mIndx=0;
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==val)
                return i;
        }
        return -1;
    }
}