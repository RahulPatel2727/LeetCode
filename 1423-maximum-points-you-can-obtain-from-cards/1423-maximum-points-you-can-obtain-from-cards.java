class Solution {
    public int maxScore(int[] cardPoints, int k) {
        return preSum(cardPoints, k);
    }
    static int preSum(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;
        int stSum = 0;
        for (int i = 0; i < k; i++) {
            stSum += arr[i];
        }
        maxSum = stSum;
        int eiSum = 0;
        int itr = k-1;
        for (int i = n - 1; i > n - k - 1; i--) {
            eiSum += arr[i];
            stSum -= arr[itr];
            maxSum = Math.max(maxSum, eiSum + stSum);
            itr--;
        }
        return maxSum;
    }
}


// 19 12
// 23 47 44 24 38 47 34 58 19 33 67 17 33 20 63 46 31 50 18 