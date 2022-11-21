class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i=0;
        while(i<arr.length-2){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
                return true;
            }
            i++;
        }
        return false;
    }
}