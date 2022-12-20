class Solution {
    public int[] nextGreaterElements(int[] nums) {
        return nextGE(nums);
    }
    public static int [] nextGE(int [] arr){
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[arr.length];
        for(int i=arr.length*2-1;i>=0; i--){
            while(!st.isEmpty() && arr[i%arr.length]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%ans.length] = -1;
            }
            else{
                ans[i%ans.length] = arr[st.peek()];
            }
            st.push(i%ans.length);
        }
        return ans;
    }
}