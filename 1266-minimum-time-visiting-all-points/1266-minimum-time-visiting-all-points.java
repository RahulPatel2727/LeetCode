class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int ans = 0;
        for(int i = 0;i<n-1;i++){
            int a1 = points[i][0];
            int b1 = points[i][1];
            int a2 = points[i+1][0];
            int b2 = points[i+1][1];
            int difA = Math.max(a1,a2) - Math.min(a1,a2);
            int difB = Math.max(b1,b2) - Math.min(b1,b2);
            ans += Math.max(difA, difB);
        }
        
        return ans;
    }
}