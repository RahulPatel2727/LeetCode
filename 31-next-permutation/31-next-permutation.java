class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1)
            return;
        point(nums);
    }
    private static void point(int []arr){
        int pos1=0,pos2=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pos1=i;
                break;
            }
        }
        for(int i=arr.length-1;i>pos1;i--){
            if(arr[i]>arr[pos1]){
                pos2=i;
                break;
            }
        }
        
        if(pos1==0 && pos2==0){
            reverse(arr,0,arr.length-1);
            // return;
        }
        else{
            int temp = arr[pos1];
            arr[pos1]=arr[pos2];
            arr[pos2]=temp;
            reverse(arr,pos1+1,arr.length-1);
        }
    }
    private static void reverse(int []arr,int st,int en){
        while(st<=en){
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;en--;
        }
    }
}