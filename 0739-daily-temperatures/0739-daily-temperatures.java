class Solution {
    public int[] dailyTemperatures(int[] t) {
        return nextTemp(t);
    }
    public static int[] nextTemp(int [] arr){
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                ans[st.peek()] = i-st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}