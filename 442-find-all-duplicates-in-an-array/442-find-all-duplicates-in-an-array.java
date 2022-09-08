class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int []arr=new int[nums.length+1];
        for(int i:nums){
            arr[i]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                list.add(i);
            }
        }
        return list;
    }
}