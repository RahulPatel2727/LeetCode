class Solution {
    public int arraySign(int[] nums) {
        int c = 1;
        for(int it : nums){
            if(it == 0){
                return 0;
            }
            if(it < 0){
                c *= -1;
            }
            
        }
        return c;
    }
}