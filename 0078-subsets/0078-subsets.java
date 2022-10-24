class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int pow = (int) Math.pow(2,nums.length);
        for(int i=0;i<pow;i++){
            List lst=new ArrayList();
            
            //for null case
            if(i==0){
                list.add(lst);
                continue;
            } 
            
            // bit are length of the nums if len 4 then   bits -> 0 0 0 0
            // if bit is set then add that 
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