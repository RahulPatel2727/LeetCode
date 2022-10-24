class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int res = 0;
        int col = mat[0].length;
        for(int i=0;i<row; i++){
            for(int j =0; j<col; j++){
                if(mat[i][j]==1){
                    int count = 0;boolean f = false;
                    for(int m=0;m<col;m++){
                        if(mat[i][m]==1){
                            count ++;
                            if(count > 1){
                                f = true;
                                break;
                            }
                        }
                    }
                    if(f){
                        break;
                    }
                    boolean f2 = false;
                    for(int m = 0;m<row; m++){
                        if(mat[m][j]==1){
                            count ++;
                            if(count >2){
                                f2 = true;
                                break;
                            }
                        }
                    }
                    if(f2){
                        break;
                    }
                    res++;
                }
            }
        }
        return res;
    }
}