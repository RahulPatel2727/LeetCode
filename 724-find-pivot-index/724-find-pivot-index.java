class Solution {
    public int pivotIndex(int[] nums) {
        return pivot(nums);
    }
    public static int pivot(int []arr){
        int left=0,sum=0;
        for(int i:arr){
            sum+=i;
        }
        for(int i=0;i<arr.length;i++){
            if((sum-left-arr[i])==left){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}