class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int odd = 0, even = 0;
        while(odd<nums.length && even<nums.length){
            if(nums[odd]%2!=0 && nums[even]%2==0){
                if(odd<even){
                    int t = nums[odd];
                    nums[odd] = nums[even];
                    nums[even] = t;
                }
                else{
                    int t = odd;
                    odd = even;
                    even = t;
                    // continue;
                }
            }
            
            if(nums[odd]%2==0){
                odd++;
            }
            if(nums[even]%2!=0){
                even++;
            }
            
        }
        return nums;
    }
}