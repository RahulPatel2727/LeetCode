class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i [] = new int [ nums.length ];
        int index = 0;
        int end = nums.length - 1;
        int j = 0;
        for( ; j< nums.length; j++){
            if(nums[j]%2 == 0){
               i[index] = nums[j] ;
                index++;
            }
            else{
                  i[end] = nums[j];
                end--;
            }
        }
        return i;
    }
}