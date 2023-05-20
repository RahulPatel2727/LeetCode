class Solution {
    public void rotate(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, 0,arr.length-1);
    }
    public static void reverse(int [] arr, int si, int ei){
        while(si <= ei){
            int t = arr[si];
            arr[si] = arr[ei];
            arr[ei] = t;
            si++;ei--;
        }
    }
}