class Solution {
    public int arraySign(int[] nums) {
        int c = 0, z = 0;
        for(int it : nums){
            if(it == 0){
                return 0;
            }
            else if(it < 0){
                c++;
            }
        }
        if(c % 2 == 0){
            return 1;
        }
        return -1;
    }
}