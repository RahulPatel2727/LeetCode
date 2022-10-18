class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pair = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                int indx = list.indexOf(nums[i]);
                pair++;
                list.remove(indx);
            }
            else{
                list.add(nums[i]);
            }
        }
        return new int[]{pair,list.size()};
    }
}