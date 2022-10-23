class Solution {
    public int[] decompressRLElist(int[] nums) {
        List <Integer > list = new ArrayList<>();
        for(int i=0;i<nums.length-1;i += 2){
            int frq = nums[i];
            int val = nums[i+1];
            while(frq!=0){
                list.add(val);
                frq--;
            }
        }
        int []res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}