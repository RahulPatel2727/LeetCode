class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        find3(k,n,1,new ArrayList<Integer>(), ans); 
        return ans;
    }
    public static void find3(int k, int val, int ind,  List<Integer>list, List<List<Integer>> ans){
        if(val == 0 && list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = ind; i <= 9; i++){
            if(i <= val ){
                list.add(i);
                find3(k, val - i,i+1, list, ans);
            
                list.remove(list.size() - 1);
                // if(i>val)
                //     break;
            }
        }
    }
}