class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        // int min=nums[0];
        // int max=nums[nums.length-1];
        List<Integer>l=new ArrayList<>();
        int arr[]=nums;
        for(int i:arr){
            l.add(i);
        }
        list.add(l);
        
        while(true){
            int pos1=0,pos2=0;
            for(int i=nums.length-1;i>0;i--){
                if(arr[i]>arr[i-1]){
                    pos1=i-1;
                    break;
                }
            }
            for(int i=nums.length-1;i>=0;i--){
                if(arr[pos1]<arr[i]){
                    pos2=i;
                    break;
                }
            }
            if(pos1==0&&pos2==0){
                break;
            }
            int t=arr[pos1];
            arr[pos1]=arr[pos2];
            arr[pos2]=t;
            reverse(arr,pos1+1,arr.length-1);
            List<Integer>lst=new ArrayList<>();
            for(int i:arr){
                lst.add(i);
            }
            list.add(lst);
            
        }
        return list;
        
    }
    public static void reverse(int []arr,int st,int en){
        while(st<=en){
            int i=arr[st];
            arr[st]=arr[en];
            arr[en]=i;
            st++;en--;
        }
    }
}