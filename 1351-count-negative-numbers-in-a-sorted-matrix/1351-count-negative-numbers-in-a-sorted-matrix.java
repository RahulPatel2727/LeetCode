class Solution {
    public int countNegatives(int[][] grid) {
        int rStart=0;
        int rEnd=grid.length-1;
        int cStart=grid[0].length-1;
        int count=0;
        while(rStart<grid.length && cStart>=0){
            if(grid[rStart][cStart]<0){
                count=count+(rEnd-rStart+1);
                cStart--;
            }
            else{
            rStart++; 
            }
        }
        return count;  
    }
}