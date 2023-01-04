class Solution {
    static int [] temp;
    public int combinationSum4(int[] nums, int target) {
        temp = new int[target + 1];
        Arrays.fill(temp, -1);
        temp[0] = 1;
        return find4(nums, target);
    }
    
    public static int find4(int [] arr, int val){
        if(temp[val] != -1){
            return temp[val];
        }
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            if(val >= arr[i]){
                ans += find4(arr, val - arr[i]);
            }
        }
        temp[val] = ans;
        return ans;
    }
}