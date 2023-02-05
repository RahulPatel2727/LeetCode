class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int maxAns = 0;
        Arrays.sort(special);
        for(int it : special){
            maxAns = Math.max(maxAns, (it-bottom));
            bottom = it+1;
        }
        maxAns = Math.max(maxAns,(top-special[special.length-1]));
        return maxAns;
    }
}