class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        combination(candidates,target,"",0,res,new ArrayList<>());
        return res;
    }
    public static void combination(int[] arr, int target, String ans, int idx,List<List<Integer>> res,List<Integer>list) {
		if (target == 0) {
            res.add(new ArrayList(list));
			System.out.print(ans+" ");
			return;
		}
		for (int i = idx; i < arr.length; i++) {
			if (i != idx && arr[i] == arr[i - 1]) {
				continue;
			}
			if (target >= arr[i]) {
                list.add(arr[i]);
				combination(arr, target - arr[i], ans + arr[i] + " ", i + 1,res,list);
                list.remove(list.size()-1);
			}

		}
	}
}