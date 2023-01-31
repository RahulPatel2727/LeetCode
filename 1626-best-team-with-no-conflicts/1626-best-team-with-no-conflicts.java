class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int[] dp = new int[n];
        List<int[]> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            players.add(new int[]{ages[i], scores[i]});
        }
        Collections.sort(players, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int res = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = players.get(i)[1];
            for (int j = 0; j < i; j++) {
                if (players.get(j)[1] <= players.get(i)[1]) {
                    dp[i] = Math.max(dp[i], dp[j] + players.get(i)[1]);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
