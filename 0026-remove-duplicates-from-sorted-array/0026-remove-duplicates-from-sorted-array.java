class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==1){return 1;}
        else{
            int count=0;
            
            for(int i =0 ; i  < nums.length-count-1;){
                
               if(nums [i] == nums[i+1]){
                   int j;
                   
                   
                   for(j = i; j<nums.length-count-1; j++ ){
                      nums[j]=nums[j+1];
                    }
                   count++;
                    nums[j]=Integer.MIN_VALUE;
                }
                
                else {
                    i++;
                }
            }
            return nums.length - count;
        }
    }
}