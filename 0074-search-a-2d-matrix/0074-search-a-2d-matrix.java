class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int si = 0, ei = (m*n) - 1;
        while(si<=ei){
            int mid = si + (ei - si) / 2;
            int val = matrix[mid / n][mid % n];
            if(val == target){
                return true;
            }
            else if(val > target){
                ei = mid - 1;
            }
            else{
                si = mid + 1;
            }
        }
        return false;
    }
}