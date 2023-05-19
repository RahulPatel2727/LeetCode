class Solution {
    public void sortColors(int[] nums) {
        int si=0, ei=nums.length-1, cur = 0;
        while(cur <= ei){
            if(nums[cur]==0){
                swap(nums, cur, si);
                cur++;
                si++;
            }
            else if(nums[cur]==2){
                swap(nums, cur, ei);
                ei--;
                // cur++;
            }
            else 
                cur++;
        }
    }
    public static void swap(int [] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}