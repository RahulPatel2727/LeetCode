class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int loop = (int)Math.pow(2,nums.length);
        for(int i=0;i<loop; i++){
            List<Integer> list = new ArrayList<>();
            if(i==0){
                res.add(list);
                continue;
            }
            
            for(int j = 0; j<nums.length;j++){
                if((i & (1 << j)) !=0 ){
                    list.add(nums[j]);
                }
            }
            Collections.sort(list);
            if(!res.contains(list)){
                res.add(list);
            }
        }
        return res;
    }
}