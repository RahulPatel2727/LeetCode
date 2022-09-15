class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        return diagonalTraversal(mat);
//         int m=mat.length;//row
//         int n=mat[0].length;//col
        
//         int []res=new int[m*n];
//         int ptr =0;
//         for(int itr=0;itr<m+n-1;itr++){
//             int i,j=0;
//             if(itr<n){
//                 i=0;
//                 j=itr;
//             }
//             else{
//                 j=m-1;
//                 i=itr-m+1;
//             }
//             ArrayList<Integer>list= new ArrayList<>();
//             while(i<m && j>=0){
//                 list.add(mat[i][j]);
//                 i++;
//                 j--;
//             }
//             if(itr%2==0){
//                 for(int k=list.size()-1;k>=0;k--){
//                     res[ptr]=list.get(k);
//                     ptr++;
//                 }
//             }
//             else{
//                 for(Integer val:list){
//                     res[ptr]=val;
//                     ptr++;
//                 }
//             }
//         }
//         return res;
    }
     public static int[] diagonalTraversal(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int []res=new int[m*n];
        int k=0;
        for(int d=0;d<m+n-1;d++){
            int r,c=0;
            if(d<m){
                r=0;
                c=d;
            }
            else{
                c=m-1;
                r=d-m+1;
            }
            ArrayList<Integer>list=new ArrayList<>();
            while(r<n && c>=0){
                list.add(arr[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                for (int i =list.size()-1;i>=0; i--) {
                    res[k]=list.get(i);
                    k++;
                }
            }
            else{
                for (int i =0;i<list.size(); i++) {
                    res[k]=list.get(i);
                    k++;
                }
            }
        }
        return res;
    }
}