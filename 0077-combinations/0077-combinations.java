class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        find(1, n, k, new ArrayList<>(), ans);
        return ans;
    }
    public static void find(int arr, int n, int k, List<Integer> ds, List<List<Integer>> ans){
        if(arr > n){
            if(ds.size()==k){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        find(arr+1, n, k, ds, ans);
        ds.add(arr);
        find(arr+1,n,k,ds,ans);
        ds.remove(ds.size()-1);
    }
}