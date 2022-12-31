class Solution { 
 // DFS function
 public int DFS(int [][]obstacleGrid,int i,int j,int totalZeros,int currentZeros)
 {
     // Checking whether current position is valid or not
     if(i<0 || i>=obstacleGrid.length || j<0 || j>=obstacleGrid[0].length)
         return 0;
     // If current cell is an obstacle ,then we cant proceed further, hence no path exists
     if(obstacleGrid[i][j]==-1)
         return 0;
     // If we found ending square then we got a path. But also take care of number of zeros traversed.
     if(obstacleGrid[i][j]==2 && totalZeros==currentZeros-1)
         return 1;
     else if(obstacleGrid[i][j]==2)
         return 0;
     // If all the above conditions were false, it means our cell is having 0 and we can move further, so first make that cell to be invalid.
     obstacleGrid[i][j]=-1;
     // Now, perform for the four directions of current cell
     int totalPaths=DFS(obstacleGrid,i+1,j,totalZeros,currentZeros+1)+
                    DFS(obstacleGrid,i-1,j,totalZeros,currentZeros+1)+
                    DFS(obstacleGrid,i,j+1,totalZeros,currentZeros+1)+ 
                    DFS(obstacleGrid,i,j-1,totalZeros,currentZeros+1);
     // Backtrack=>Make that cell as valid so that we can use this cell for other paths.
     obstacleGrid[i][j]=0;
     // Finally return total number of valid paths.
     return totalPaths;
 }

 public int uniquePathsIII(int[][] grid) {
     
     int totalZeros=0,startX=0,startY=0;
     // Find total number of zeros, we should move exactly once and also find starting cell indices.
     for(int i=0;i<grid.length;i++)
     {
         for(int j=0;j<grid[0].length;j++)
         {
             if(grid[i][j]==0)
                 totalZeros++;
             if(grid[i][j]==1)
             {
                 startX=i;
                 startY=j;
             }
         }
     }
     // Calling DFS Function.
     return DFS(grid,startX,startY,totalZeros,0);
 }
}