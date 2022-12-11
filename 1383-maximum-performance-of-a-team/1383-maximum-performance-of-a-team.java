class Solution {
    private long MOD = (long)(1e9 + 7);
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] es = new int[speed.length][2];
        for(int i=0; i<es.length; i++){
            es[i][0] = efficiency[i];
            es[i][1] = speed[i];
        }
        Arrays.sort(es, (a,b) -> b[0]-a[0]);//highest to lowest efficiency, since we need instant access to current lowest efficiency while processing performance
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);  //min speed first, since we will remove the slowest one from the ones already part of k
        
        long perf = 0, speedsum = 0;
        for(int i=0; i<es.length; i++){
            speedsum += es[i][1];
            pq.offer(es[i][1]);
            perf = Math.max(perf, es[i][0]*speedsum);
            if(pq.size()==k){
                speedsum -= pq.poll();  //remove min speed (efficiency won't be affected)
            }            
        }
        return (int)(perf%MOD);
    }
}