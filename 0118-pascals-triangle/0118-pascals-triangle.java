class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        
        int i = 2;
        
        while(i<=n){
            List<Integer> ds = new ArrayList<>();
            List<Integer> pre = ans.get(i-2);
            int size = pre.size();
            int j = 0;
            while(j<size){
                if(j == 0){
                    ds.add(1);
                }
                else{
                    ds.add(pre.get(j)+pre.get(j-1));
                }
                j++;
            }
            ds.add(1);
            ans.add(ds);
            i++;
        }
        return ans;
    }
}