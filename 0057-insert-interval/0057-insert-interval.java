class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0)
            return new int[][]{{newInterval[0],newInterval[1]}};
        List<int []>ans = new ArrayList<>();
        int f = 0;
        for(int i=0;i<intervals.length;i++){
            if(isBelong( new int[]{intervals[i][0],intervals[i][1]}, newInterval)){
                newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
                f = 1;
            }
            else{
                ans.add(new int[]{Math.min(intervals[i][0],newInterval[0]),Math.min(intervals[i][1],newInterval[1])});
                newInterval[0] = Math.max(intervals[i][0],newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
                f = 0;
            }
        }
        if(f == 1)
            ans.add(new int[]{Math.min(intervals[intervals.length-1][0],newInterval[0]),Math.max(intervals[intervals.length-1][1],newInterval[1])});
        else 
            ans.add(newInterval);
        int [][] res = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            int j = 0;
            for(int it : ans.get(i)){
                res[i][j] = it;
                j++;
            }
        }
        return res;
    }
    public static boolean isBelong(int []a,int []b){
        int maxA = Math.max(a[0],b[0]);
        int minB = Math.min(a[1],b[1]);
        if((maxA>=a[0] && maxA<=a[1] && maxA>=b[0] && maxA<=b[1]) && (minB>=a[0] && minB<=a[1] && minB>=b[0] && minB<=b[1])){
            return true;
        }
        return false;
    }
}