class Solution {
    public void sortColors(int[] nums) {
        int si = 0, ei = nums.length-1, mid = 0; 
        while( mid<=ei){
            if(nums[mid]==0){
                nums[mid] = nums[si]; 
                nums[si] = 0;
                si++;
                mid++;
            }
            else if(nums[mid]==2){
                nums[mid] = nums[ei];
                nums[ei] = 2;
                ei--;
                // mid++;
            }
            else{
                mid++;
            }
        }
    }
}