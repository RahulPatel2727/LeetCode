class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%nums.length; 
        Rotate(nums,0,(n-k-1));
        Rotate(nums,(n-k),n-1);
        Rotate(nums,0,n-1);
        // for(int i:nums)
        //     System.out.print(i+" ");
        
    }
    public static void Rotate(int []arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
}