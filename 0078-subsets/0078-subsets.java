class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int pow=(int)Math.pow(2,nums.length);
        for(int i=0;i<pow;i++){
            List lst=new ArrayList();
            if(i==0){
                list.add(lst);
                continue;
            } 
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j))!=0){
                    lst.add(nums[j]);
                }
            }
            list.add(lst);
        }
        return list;
    }
}