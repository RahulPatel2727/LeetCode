class Solution {
    public static void setZeroes(int[][] mtx) {
        int m = mtx.length;
        int n = mtx[0].length;
        int r=-1,c=-1;
        for(int i=0;i<m;i++){
            if(mtx[i][0]==0){
                c = 1;
            }
            for(int j = 0;j<n;j++){
                if(i==0 && mtx[i][j]==0){
                    r = 1;
                }
                if(mtx[i][j] == 0){
                    mtx[0][j] = 0;
                    mtx[i][0] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if(mtx[0][j]==0){
                for (int i = 1; i < m; i++) {
                    mtx[i][j] = 0;
                }        
            }
        }
        for (int i = 1; i < m; i++) {
            if(mtx[i][0]==0){
                for (int j = 1; j < n; j++) {
                    mtx[i][j] = 0;
                }
            }
        }

        if(r == 1){
            for(int i=0;i<n;i++){
                mtx[0][i] = 0;
            }
        }
        if(c == 1){
            for (int i = 0; i < m; i++) {
                mtx[i][0] = 0;
            }
        }
        
    }
    
}