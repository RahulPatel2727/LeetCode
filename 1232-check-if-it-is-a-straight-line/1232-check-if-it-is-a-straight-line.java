class Solution {
    public boolean checkStraightLine(int[][] c) {
        int m = c[0][0]-c[0][1];
        for(int i=2;i<c.length;i++){
            if((c[i][1] - c[0][1]) * (c[i][0] - c[1][0]) != (c[i][1] - c[1][1]) * (c[i][0] - c[0][0])){
                return false;
            } 
        }
        return true;
    }
}