class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int max = 0;
        for(int it : left){
            max = Math.max(it,max);
        }
        int min = Integer.MAX_VALUE;
        for(int it : right){
            min = Math.min(it, min);
        }
        return Math.max(max, n-min);
        
    }
}
// class Solution {
//     public int getLastMoment(int n, int[] left, int[] right) {
//         int ans = 0;
//         for (int num : left) {
//             ans = Math.max(ans, num);
//         }
//         System.out.println(ans);
        
//         for (int num : right) {
//             ans = Math.max(ans, n - num);
//         }
        
//         return ans;
//     }
// }