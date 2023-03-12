class Solution {
    public int maxScore(int[] arr) {
        Arrays.sort(arr);
        long sum = 0;
        int c = 0;
        for(int i=arr.length-1;i>=0;i--){
            sum += arr[i];
            if(sum > 0){
                c++;
            }
        }
        // long c = 0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>0){
        //         c++;
        //     }
        // }
        return c;
    }
}