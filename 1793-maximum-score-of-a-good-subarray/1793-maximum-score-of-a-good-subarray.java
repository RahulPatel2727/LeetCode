class Solution {
    public int maximumScore(int[] nums, int k) {
        return area(nums, k);
    }
    public static int area(int []arr, int k) {
        Stack<Integer> st = new Stack<>();
        int maxArea=0;
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int  h = arr[st.pop()];
                int r = i;
                if(r-1 >= k) {
                    if (st.isEmpty()) {
                        maxArea = Math.max(maxArea, h * r);
                    } else {
                        int l = st.peek();
                        if(l+1<=k) {
                            maxArea = Math.max(maxArea, h * (r - l - 1));
                        }
                    }
                }
            }
            st.push(i);
        }
        int  r = arr.length;
        while(!st.isEmpty() ){
            int  h = arr[st.pop()];
            if(r-1 >= k) {
                if (st.isEmpty()) {
                    maxArea = Math.max(maxArea, h * r);
                } else {
                    int l = st.peek();
                    if(l+1<=k) {
                        maxArea = Math.max(maxArea, h * (r - l - 1));
                    }
                }
            }
        }
        return maxArea;
    }
}