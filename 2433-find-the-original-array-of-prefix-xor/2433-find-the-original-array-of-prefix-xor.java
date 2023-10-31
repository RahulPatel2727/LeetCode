class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        
        int[] arr = new int[n];
        arr[0] = pref[0];
        int t = 0;
        // let 8 ^ x = 9 ; then 8 ^ 9 = x 
        for (int i = 1; i < n; i++) {
            arr[i] = pref[i] ^ pref[i-1];
        }
        
        return arr;
    }
}