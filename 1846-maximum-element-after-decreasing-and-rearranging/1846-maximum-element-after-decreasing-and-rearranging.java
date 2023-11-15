class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
        for(int i=1;i<n;i++){
            if(Math.abs(arr[i] - arr[i-1]) > 1){
                arr[i] = arr[i-1]+1;
            }
        }
        // System.out.println(Arrays.toString(arr));
        if(arr[n-1]>n){
            return n;
        }
        return arr[n-1];
    }
}