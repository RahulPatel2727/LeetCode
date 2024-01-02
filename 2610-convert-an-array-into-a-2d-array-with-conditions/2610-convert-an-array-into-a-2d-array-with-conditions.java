class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int []f = new int[nums.length+1];
        int max = 0;
        for(int i=0;i<nums.length;i++){
            f[nums[i]-'0'+48]++;
            max = Math.max(max, f[nums[i]-'0'+48]);
        }
        System.out.println(Arrays.toString(f));
        for(int j=0;j<max;j++){
            List<Integer> it = new ArrayList<>();
            for(int i=1;i<f.length;i++){
                if(f[i]>0) {
                    it.add(i);
                    f[i]--;
                }
            }
            ans.add(new ArrayList<>(it));
        }
        return ans;
    }
}