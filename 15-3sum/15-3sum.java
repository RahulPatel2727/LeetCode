class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>mainList=new ArrayList<>();
        int n =nums.length;
        // int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE,mid=-1;
        for(int i=0;i<n;i++){
            int st=i+1,en=n-1;
            while(st<en){
                int temp = nums[i]+nums[st]+nums[en];
                if(temp==0){
                    List<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[st]);
                    list.add(nums[en]);
                    mainList.add(list);
                    int x=nums[st];
                    int y=nums[en];
                    while(st<en && nums[st]==y){
                        st++;
                    }
                    while(st<en && nums[en]==y){
                        en--;
                    }
                    // st++;en=n-1;
                }
                else if(temp<0){
                    st++;
                }
                else{
                    en--;
                }
            }
            while(i+1 < n && nums[i] == nums[i+1]){
                i++;
            }
        }
        return mainList;
    }
}