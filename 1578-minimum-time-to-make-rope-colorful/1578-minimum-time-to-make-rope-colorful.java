class Solution {
    public int minCost(String str, int[] arr) {
        return min(str,arr);
    }
    public static int min(String str, int[] arr) {
        str+="/";
        int ans  = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                sum += arr[i];
                max = Math.max(max, arr[i]);
            }
            else{
                if(sum>0) {
                    sum += arr[i];
                    max = Math.max(max,arr[i]);
                    ans += sum - max;
                }
                max = Integer.MIN_VALUE;
                sum = 0;
            }
        }
        return ans;
    }
}