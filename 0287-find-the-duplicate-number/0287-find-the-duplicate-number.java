class Solution {
    public int findDuplicate(int[] nums) {
        int duplicate = -1;
        int st = 1,en = nums.length-1;
        while(st<=en){
            int count = 0;
            int mid = st + (en-st)/2;
            for(int i:nums){
                if(i<=mid){
                    count++;
                }
            }
            if(mid<count){
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