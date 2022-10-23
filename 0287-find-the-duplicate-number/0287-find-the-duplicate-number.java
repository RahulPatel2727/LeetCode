class Solution {
    public int findDuplicate(int[] nums) {
        int duplicate = -1;
        int st = 1; int en = nums.length-1;
        while(st<=en){
            int mid = st + (en -st)/2;
            int frq = 0;
            for(int i : nums){
                if(i <= mid){
                    frq++;
                }
            }
            
            if(mid<frq){
                duplicate = mid;
                en = mid-1;
            }
            else{
                st = mid + 1;
            }
        }
        return duplicate;
    }
}