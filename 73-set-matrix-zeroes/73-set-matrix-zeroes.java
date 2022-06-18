class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length, col=matrix[0].length;
        int x=1,y=1;
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                y=0;
                break;
            }
        }
        for(int i=0;i<col;i++){
            if(matrix[0][i]==0){
                x=0;
                break;
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1; j<col;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<row;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<col;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=1;j<col;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<row;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(x==0){
            for(int i=0;i<col;i++){
                matrix[0][i]=0;
            }
        }
        if(y==0){
            for(int j=0;j<row;j++){
                matrix[j][0]=0;
            }
        }
    }
}