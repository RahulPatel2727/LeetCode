class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return meth(matrix,target);
    }
    private static boolean meth(int [][]arr,int val){
        int r=arr.length;
        int c=arr[0].length;
        
        for(int i=r-1;i>=0;i--){
            if(arr[i][0]<=val){
                int s=0,e=c-1;
                while(s<=e){
                    int mid=s+(e-s)/2;
                    if(arr[i][mid]==val){
                        return true;
                    }
                    else if(arr[i][mid]>val){
                        e=mid-1;
                    }
                    else{
                        s=mid+1;
                    }
                }
                // return false;
            }
        }
        return false;
    }
}