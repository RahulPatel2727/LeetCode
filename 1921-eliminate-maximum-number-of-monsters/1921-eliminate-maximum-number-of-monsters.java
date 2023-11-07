import java.util.*;

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] at = new double[dist.length];
        for (int i = 0; i < dist.length; i++) {
            at[i] = (double) dist[i] / speed[i];
        }
        int ans = 0;
        Arrays.sort(at);
        for (int it = 0; it < dist.length; it++) {
            if (at[it] <= it) {
                break;
            }
            ans++;
        }
        return ans;
    }
}