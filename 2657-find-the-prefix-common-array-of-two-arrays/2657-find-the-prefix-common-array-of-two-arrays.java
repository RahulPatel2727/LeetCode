class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int []a=new int[n+1];
        int []b=new int[n+1];
        int []ans=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[A[i]]=1;
                b[B[i]]=1;
                if(A[i]==B[i]){
                    c++;
                    ans[i]=c;
                    continue;
                }
                if(b[A[i]]==1)
                    c++;
                if(a[B[i]]==1)
                    c++;
                ans[i]=c;
        }
        return ans;
    }
}