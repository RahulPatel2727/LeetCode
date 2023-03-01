class Solution {
    public int[] sortArray(int[] nums) {
        int max = nums[0];
        int min = max;
        for(int it : nums){
            max = Math.max(max, it);
            min = Math.min(min, it);
        }
        return countingSort(nums, max, min);
    }
    public int[] countingSort(int[] arr, int max, int min) {
        int plus;
        if (min < 0) {
            plus = Math.abs(min);
        } else {
            plus = 0;
        }
        int cL = max + plus + 1;
        int[] c = new int[cL];
        for (int i = 0; i < arr.length; i++) {
            c[arr[i] + plus]++;
        }
        for (int i = 1; i < cL; i++) {
            c[i] = c[i] + c[i - 1];
        }
        int[] temp = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[c[arr[i] + plus] - 1] = arr[i];
            c[arr[i] + plus]--;
        }
        return temp;
    }
}