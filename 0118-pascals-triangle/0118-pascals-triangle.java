class Solution {
    public List<List<Integer>> generate(int numRows) {
        return myFun(numRows);
    }
    public static List<List<Integer>> myFun(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            List<Integer> ds = new ArrayList<>();
            int j = 1;
            while (j <= i) {
                ds.add(findValue(i - 1, j - 1));
                j++;
            }
            ans.add(ds);
            i++;
        }
        return ans;
    }

    public static int findValue(int n, int r){
        int val = 1;
        int numerator = n, denominator = 1;
        while(numerator > (n-r)){
            val = (numerator-- * val / denominator++);
        }
        return val;
    }
}