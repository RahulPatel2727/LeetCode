class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int l = 0, r = 0, sum = 0, res = 0;
        while (r < n) {
            sum += fruits[r][1];
            while (l <= r && !isValidRange(fruits[l][0], fruits[r][0], startPos, k)) {
                sum -= fruits[l++][1];
            }
            res = Math.max(res, sum);
            r++;
        }
        return res;
    }

    private boolean isValidRange(int l, int r, int start, int k) {
        if (r <= start) {
            return start - l <= k;
        } else if (l >= start) {
            return r - start <= k;
        } else {
            //go to shorter direction twice, then turn direction
            int nl = start - l, nr = r - start;
            return nl <= nr ? nl * 2 + nr <= k : nr * 2 + nl <= k;
        }
    }
}