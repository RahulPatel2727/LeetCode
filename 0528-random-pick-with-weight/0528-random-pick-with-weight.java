class Solution {
    static int []arr;
    static int total;
    public Solution(int[] w) {
        for(int i=1;i<w.length;i++){
            w[i] = w[i]+w[i-1];
        }
        arr = w;
    }
    
    public int pickIndex() {
        int n = arr.length;
        int total = arr[n - 1];
        int rnd = (int)Math.ceil(Math.random()*(total));
        int si = 0, ei = n;
        while(si<ei){
            int mid = si + (ei - si)/2;
            if(arr[mid]>=rnd){
                ei = mid;
            }
            else{
                si = mid + 1;
            }
        }
        return ei;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */