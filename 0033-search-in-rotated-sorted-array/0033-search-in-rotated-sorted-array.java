class Solution {
    public int search(int[] arr, int val) {
        int len = arr.length;
        int p = pivot(arr, arr.length);
        int ans = bSearch(arr,val, 0,p-1);
        if(ans != -1){
            return ans;
        }
        return bSearch(arr, val, p, len -1);
    }
    public static int bSearch(int [] arr, int val, int s, int e){
        int si = s, ei = e;
        while(si <= ei){
            int m = si + (ei - si)/2;
            if(arr[m] == val){
                return m;
            }
            if(arr[m] > val){
                ei = m - 1;
            }
            else{
                si = m + 1;
            }
        }
        return -1;
    }
    public static int pivot(int [] arr, int len){
        int si = 0, ei = len-1;
        while(si<=ei){
            int mid = si + (ei - si) / 2;
            if(arr[mid] > arr[len - 1]){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
            
        }
        return si;
    }
}