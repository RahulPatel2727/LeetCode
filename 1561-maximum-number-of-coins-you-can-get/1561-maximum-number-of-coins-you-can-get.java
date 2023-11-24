class Solution {
    public int maxCoins(int[] piles) {
        int ans = 0;
        int n = piles.length;
        Arrays.sort(piles);
        for(int i = n-2;i>=n/3;i=i-2){
            ans+=piles[i];
        }
        return ans;
    }
}