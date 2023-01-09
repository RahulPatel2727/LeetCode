class Solution {
    public void moveZeroes(int[] nums) {
        int z = 0, nz = 0;
        while(z<nums.length && nz < nums.length){
            if(nums[nz] != 0 && nums[z] == 0){
                if(nz > z){
                    int t = nums[nz];
                    nums[nz] = nums[z];
                    nums[z] = t;
                }
                else{
                    int t = nz;
                    nz = z;
                    z = t;
                }
            }
            if(nums[z] != 0){
                z++;
            }
            if(nums[nz] == 0){
                nz ++;
            }
        }
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}