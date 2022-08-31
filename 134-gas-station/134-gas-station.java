class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total =0;
        int cur=0;int start=0;
        for(int i=0;i<cost.length;i++){
            total=total+(gas[i]-cost[i]);    
            cur+=gas[i]-cost[i];
            if(cur<0){
                cur=0;
                start=i+1;
            }
        }
        if(total<0){
            // cur=0;
            return -1;
        }
        return start; 
        
    }
    
}