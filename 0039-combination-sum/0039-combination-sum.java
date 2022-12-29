class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        find(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }
    public static void find(int []arr, int ind, int val, List<Integer> ds, List<List<Integer>> ans){
        if(ind == arr.length){
            if(val == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;      
        }
        if(val >= arr[ind]){
            ds.add(arr[ind]);
            find(arr, ind, val-arr[ind], ds, ans);
            ds.remove(ds.size()-1);
        }
        find(arr,ind+1, val, ds, ans);
    }
}