class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int res = 0;
            while(num!=0){
                res = res*10 + num%10;
                num/=10;
            }
            set.add(res);
        }
        return set.size();
    }
}