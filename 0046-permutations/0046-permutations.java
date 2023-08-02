class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        find(nums, nums.length, 0, ans);
        return ans;
    }
    public static void find(int[] arr, int n, int ind, List<List<Integer>> ans){
        if(ind == n){
            List<Integer> ds = new ArrayList<>();
            for(int it : arr){
                ds.add(it);
            }
            ans.add(ds);
            return;
        }
        for(int i=ind; i<n;i++){
            swap(arr, i, ind);
            find(arr, n, ind+1, ans);
            swap(arr, i, ind);
        }
    }
    public static void swap(int[] arr, int si, int ei){
        int t = arr[si];
        arr[si] = arr[ei];
        arr[ei] = t;
    }
}