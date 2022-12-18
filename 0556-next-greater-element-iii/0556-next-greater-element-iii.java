class Solution {
    public int nextGreaterElement(int n) {
        return sol(n);
    }
    public static int sol(int n){
        int max = 2147483647;
        String str = ""+n;
        int [] arr = new int[str.length()];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=Character.getNumericValue(str.charAt(i));
        }
        
        int p1=0,p2=0;
        
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                p1=i-1;
                break;
            }
        }
        
        for(int i=arr.length-1;i>0;i--){
            if(arr[p1]<arr[i]){
                p2=i;
                break;
            }
        }
        
        if(p1==p2 && p2 == 0){
            rev(arr,0,arr.length-1);
        }
        else{
            int t = arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=t;
            rev(arr,p1+1,arr.length-1);
        }
        
        String ans = "";
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        Long res = Long.parseLong(ans);
        if(res>max || res<=n){
            return -1;
        }
        return res.intValue();
    }
    
    //to teverse
    public static void rev(int []arr, int st, int en){
        while(st<=en){
            int t = arr[st];
            arr[st]=arr[en];
            arr[en]=t;
            st++;en--;
        }
    }
}