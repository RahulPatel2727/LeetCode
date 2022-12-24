class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combi(candidates, 0,target, 0, new ArrayList<>(),ans);
        return ans;
    }
    public static void combi(int [] arr,int ind, int target,int sum, List<Integer> temp, List<List<Integer>> ans){
        if(sum>target){
            return;
        }
        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(ind == arr.length){
            return;
        }
        
        sum += arr[ind];
        temp.add(arr[ind]);
        combi(arr,ind,target,sum,temp,ans);
        sum -= arr[ind];
        temp.remove(temp.size()-1);
        combi(arr,ind+1,target,sum,temp,ans);
    }
}