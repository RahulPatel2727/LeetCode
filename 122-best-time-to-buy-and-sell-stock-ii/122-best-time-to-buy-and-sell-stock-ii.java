class Solution {
    public int maxProfit(int[] prices) {
        return buySell1(prices);
    }
//     best solution
    public static int buySell1(int []arr){
        int count=0;
        for(int i=1;i<arr.length;i++){
            if ( arr[i] > arr[i - 1] ) {
                count += arr[i] - arr[i-1];
            }
        }
        return count;
    }
//     brute force approtch
    private static int buySell2(int []arr){
        int res=0;
        int c=0;
        int k=0;boolean b=false;
        for(int i=0;i<arr.length-1;){
            if(arr[i]<arr[i+1]){
                i++;
                k=i;
                b=true;
            }
            else{
                res+=arr[i]-arr[c];
                i++;
                c=i;
                b=false;
            }
        }
        if(c!=k && b==true){
            res+=arr[k]-arr[c];
        }
        return res;
    }
}