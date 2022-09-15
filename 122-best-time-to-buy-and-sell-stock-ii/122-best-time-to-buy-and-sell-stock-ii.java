class Solution {
    public int maxProfit(int[] prices) {
        return buySell(prices);
    }
    private static int buySell(int []arr){
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