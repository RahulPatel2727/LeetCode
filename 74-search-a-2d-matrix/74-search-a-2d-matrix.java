class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix,target);
        
    }
    private static boolean search(int [][]arr,int val){
        int row=0,col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==val){
                return true;
            }
            else if(arr[row][col]>val){
                col--;
            }
            else if(arr[row][col]<val){
                row++;
            }
        }
        return false;
    }
}