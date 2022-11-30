class Solution {
    public int largestRectangleArea(int[] heights) {
        return area(heights);
    }
    public static int area(int []arr){
        Stack<Integer> st = new Stack<>();
        int maxArea=0;
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int  h = arr[st.pop()];
                int r = i;
                if(st.isEmpty()){
                    maxArea = Math.max(maxArea, h*r);
                }
                else {
                    int l = st.peek();
                    maxArea = Math.max(maxArea, h*(r-l-1));
                }
            }
            st.push(i);
        }
        int  r = arr.length;
        while(!st.isEmpty() ){
            int  h = arr[st.pop()];
            if(st.isEmpty()){
                maxArea = Math.max(maxArea, h*r);
            }
            else {
                int l = st.peek();
                maxArea = Math.max(maxArea, h*(r-l-1));
            }
        }
        return maxArea;
    }
}