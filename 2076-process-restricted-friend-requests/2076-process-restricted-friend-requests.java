class Solution {
    public boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        int j=0;
        boolean[] ret=new boolean[requests.length];
        for(int[] a:requests){
            int x=find(a[0],arr);
            int y=find(a[1],arr);
            boolean flag=true;
            for(int i=0;i<restrictions.length;i++){
                int l=find(restrictions[i][0],arr);
                int r=find(restrictions[i][1],arr);
                if(((l==x && r==y) || (l==y && r==x))){
                    flag=false;
                    break;
                }
            }
            ret[j++]=flag;
            if(flag){
                union(x,y,arr);
            }
        }
        return ret;
    }
    private void union(int a,int b,int[] arr){
        int x=find(a,arr);
        int y=find(b,arr);
        if(x==y) return;
        arr[y]=x;
    }
    private int find(int x,int[] arr){
        if(arr[x]==x) return x;
        return find(arr[x],arr);
    }
}