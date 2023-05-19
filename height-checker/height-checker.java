class Solution {
    public int heightChecker(int[] heights) {
        int [] check = new int[heights.length];
        System.arraycopy(heights,0,check,0,heights.length);
        int ans = 0;
        for(int i=0;i<heights.length;i++){
            for(int j = i+1; j<heights.length;j++){
                if(heights[i]>heights[j]){
                    swap(heights, i, j);
                }
            }
        }
        
        for(int i=0;i<heights.length;i++){
            if(check[i] != heights[i]){
                ans++;
            }
        }
        return ans;
    }
    public static void swap(int [] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}