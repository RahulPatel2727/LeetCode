class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(check(m,k,bloomDay)) return -1;
        return bs(bloomDay, m, k);
    }
    static int bs(int []arr, int b, int cf){
        int l=1, h = Arrays.stream(arr).max().getAsInt();
        while(l<=h){
            int mid = l + (h-l)/2;
            boolean check = possible(mid, arr, b, cf);
            if(check){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
    static boolean possible(int mid, int []arr, int b, int cf){
        int c = 0;
        int ccf = 0;
        for(int i : arr){
            if(i<=mid){
                c++;
            }else{
                ccf += c/cf;
                c = 0;
            }
        }
        ccf += c>0?c/cf:0;
        return ccf >= b;
    }
    static boolean check(int m, int k, int []arr){
        int n = arr.length;
        int l = 1, h = k;
        while(l<=h){
            int mid = l + (h - l)/2;
            if(n>=mid*m) l = mid + 1;
            else return true;
        }
        return false;
    }
}