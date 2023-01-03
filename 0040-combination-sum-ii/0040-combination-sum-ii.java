class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        find(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    public static void find(int [] arr, int val ,  int ind, List<Integer> ds, List<List<Integer>> ans ){
        if(val == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i < arr.length; i++){
            if(i!=ind && arr[i] == arr[i-1]){
                continue;
            }
            if(val >= arr[i]){
                ds.add(arr[i]);
                find(arr, val - arr[i], i + 1, ds, ans);
                ds.remove(ds.size()-1);
            }
        }
    }
}