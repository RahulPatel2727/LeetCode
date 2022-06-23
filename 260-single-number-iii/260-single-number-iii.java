class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        
        xor=(xor&~(xor-1));
        int n1=0,n2=0;
        for(int i=0; i<nums.length;i++){
            if((nums[i]&xor)!=0)
                n1^=nums[i];
            else
                n2^=nums[i];
        }
        return new int[]{n1,n2};
    }
}