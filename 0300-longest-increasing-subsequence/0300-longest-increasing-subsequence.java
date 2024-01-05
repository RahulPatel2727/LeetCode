class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        int len = 1;
        for(int i = 1; i<nums.length;i++){
            if(nums[i] == ans.get(len-1)) continue;
            if(nums[i]>ans.get(len-1)){
                ans.add(nums[i]);
                len++;
            }else{
                int l = 0, h = len-1;
                while(l <= h){
                    int mid = l + (h - l)/2;
                    if(ans.get(mid) >= nums[i]){
                        h = mid - 1;
                    }else{
                        l = mid + 1;
                    }
                }
                ans.remove(l);
                ans.add(l,nums[i]);
            }
        }
        return len;
    }
}