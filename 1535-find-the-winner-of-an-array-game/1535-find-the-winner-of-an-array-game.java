class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        int max = arr[0];
        int cur = arr[0];
        int c = 0;
        for(int i=1;i<n;i++){
            max = Math.max(arr[i], max);
            if(cur>arr[i]){
                c++;
            }
            else{
                cur = arr[i];
                c = 1;
            }
            if(c==k){
                return cur;
            }
        }
        if(cur == max){
            return cur;
        }
        return -1;
    }
}