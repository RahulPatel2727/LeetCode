class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> Integer.compare(a[1], b[1]));
        int clash = 0;
        int preEndTime = Integer.MIN_VALUE;
        
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if ( start>= preEndTime) {
                preEndTime = end;
            } 
            else {
                clash++;
            }
        }
        
        return clash;
    }
}