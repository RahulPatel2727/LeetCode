class Solution {
    public int minimizeMax(int[] arr, int p) {
        Arrays.sort(arr);
        int si = 0, ei = arr[arr.length -1] - arr[0];
        while(si < ei){
            int mid = si + (ei - si) / 2;
            if(pairs(arr, mid) >=p){
                ei=mid;
            }
            else{
                si = mid + 1;
            }
        }
        return si;
    }
    public static int pairs(int [] arr, int dif){
        int c = 0;
        for(int i=0;i<arr.length - 1;i++){
            if(arr[i + 1] - arr[i] <= dif){
                c++;
                i++;
            }
        }
        return c;
    }
}