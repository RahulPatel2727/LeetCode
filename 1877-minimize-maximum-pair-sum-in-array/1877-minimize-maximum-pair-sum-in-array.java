class Solution {
    public int minPairSum(int[] nums) {
        int[] count = new int[100001];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            count[i]++;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        System.out.println(min+" "+max);
        int low = min, high = max;
        max = Integer.MIN_VALUE;
        while(low <= high) {
            if(count[low] == 0) low++; 
            else if(count[high] == 0) high--;
            else {
                max = Math.max(low + high, max);
                count[low]--;
                count[high]--;
            }
        }
        return max;
    }
}