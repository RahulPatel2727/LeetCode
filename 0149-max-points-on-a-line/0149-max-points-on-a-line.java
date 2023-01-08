class Solution {
    public int maxPoints(int[][] points) {
        int len = points.length;
        if(len == 1)
            return 1;
        int max = Integer.MIN_VALUE;
        Map<Float,Integer> ans = new HashMap<>();
        for(int i=0;i<points.length;i++){
            int x1 = points[i][0], y1 = points[i][1];
            for(int j=0;j<points.length;j++){
                int x2 = points[j][0], y2 = points[j][1];
                Float slope =(float) (y2-y1)/(x2-x1);
                ans.put(slope,ans.getOrDefault(slope,1)+1);
            }
            
            for(Map.Entry<Float,Integer> it:ans.entrySet()){
                max = Math.max(max,it.getValue());
            }
            ans = new HashMap<>();
        }
        return max;
    }
}