class Solution {
    public int largestAltitude(int[] gain) {
        int pre = 0;
        int max = pre;
        for(int i=0;i<gain.length;i++){
            pre += gain[i];
            if(pre > max){
                max = pre;
            }
        }
        return max;
    }
}