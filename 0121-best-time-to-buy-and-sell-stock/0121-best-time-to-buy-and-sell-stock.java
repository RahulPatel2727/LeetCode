class Solution {
    public int maxProfit(int[] arr) {
        int b = arr[0];
        int p = 0;
        for(int it : arr){
            b = Math.min(b,it);
            p = Math.max(p, it - b);
        }
        return p;
    }
}