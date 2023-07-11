class Solution {
    public List<List<Integer>> generate(int numRows) {
        return optimal(numRows);
    }
    public static List<List<Integer>> optimal(int nth){
        List<List<Integer>> ans = new ArrayList<>();
        int n = 1;
        while(n<=nth){
            List<Integer> ds = new ArrayList<>();
            ds.add(1);
            int val = 1;
            for(int c = 1; c<n; c++){
                val = val * (n - c) / c;
                ds.add(val);
            }
            ans.add(ds);
            n++;
        }
        return ans;
    }
}