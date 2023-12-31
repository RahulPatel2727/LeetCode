class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int []st = new int[k];
        int []en = new int[k];
        return preSum(cardPoints, k,st,en);
    }
    static int preSum(int[] arr, int k, int[] st, int[] en) {
        int n = arr.length;
        int maxSum = 0;
        st[0] = arr[0];
        for (int i = 1; i < k; i++) {
            st[i] = st[i - 1] + arr[i];
        }
        en[0] = arr[n - 1];
        int it = 1;
        for (int i = n - 2; i > n - k - 1; i--) {
            en[it] = arr[i] + en[it - 1];
            it++;
        }
        maxSum = Math.max(st[k - 1], en[k - 1]);
        maxSum = Math.max(maxSum, startEndMax(arr, k));

        int itr = 0;
        for (int i = k - 2; i >= 0; i--) {
            maxSum = Math.max(maxSum, st[itr] + en[i]);
            itr++;
        }
        return maxSum;
    }
    static int startEndMax(int[] arr, int k) {
        int n = arr.length;
        int si = 0, ei = n - 1;
        int sum = 0;
        while (si <= ei && k > 0) {
            if (arr[si] > arr[ei]) {
                sum += arr[si];
                si++;
            } else if (arr[si] < arr[ei]) {
                sum += arr[ei];
                ei--;
            } else {
                sum += arr[si];
                if (si <= ei && arr[si + 1] > arr[ei - 1]) {
                    si++;
                } else {
                    ei--;
                }
            }
            k--;
        }
        return sum;
    }
}