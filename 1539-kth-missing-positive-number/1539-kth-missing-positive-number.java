class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int it : arr){
            if(it <= k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}