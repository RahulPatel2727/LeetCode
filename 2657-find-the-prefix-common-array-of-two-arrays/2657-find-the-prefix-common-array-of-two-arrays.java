class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int [] ans = new int[n+1];
        int [] res= new int[n];
        int c = 0;
        for(int i=0; i<n;i++){
            ans[A[i]]++;
            
            if(ans[A[i]] == 2) {
                c++;
                // System.out.println(c);
            }
            
            ans[B[i]]++;
            if(ans[B[i]] == 2){
                c++;
                // System.out.println(c);
            }
            res[i] = c;
            
        }
        return res;
    }
}