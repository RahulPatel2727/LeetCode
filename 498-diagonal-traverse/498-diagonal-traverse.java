class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // return diagonalTraversal(mat);
        int m=mat.length;//row
        int n=mat[0].length;//col
        int i=0,j=0;
        int []res=new int[m*n];
        int ptr =0;
        for(int itr=0;itr<m+n-1;itr++){
            if(itr<n){
                i=0;
                j=itr;
            }
            else{
                j=n-1;
                i=itr-n+1;
            }
            ArrayList<Integer>list= new ArrayList<>();
            while(i<m && j>=0){
                list.add(mat[i][j]);
                i++;
                j--;
            }
            if(itr%2==0){
                for(int k=list.size()-1;k>=0;k--){
                    res[ptr]=list.get(k);
                    ptr++;
                }
            }
            else{
                for(Integer val:list){
                    res[ptr]=val;
                    ptr++;
                }
            }
        }
        return res;
    }
}