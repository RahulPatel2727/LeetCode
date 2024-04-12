class Solution {
    public int trap(int[] height) {
       return max(height);
    }
    public static int max(int []arr){
        int n = arr.length;
        int []left=new int[n];
        int []right=new int[n];
        int max1=0,max2=0;
        for(int i=0 , j=n-1; i<n && j>=0 ; i++, j--){
            if(max1<arr[i])
                max1=arr[i];
            if(max2<arr[j])
                max2=arr[j];
            left[i]=max1;
            right[j]=max2;
        }
        int res = 0;
        for(int i=0;i<n;i++){
            int t = Math.min(left[i],right[i]);
            res+=t-arr[i];
        }
        return res;
    }
}