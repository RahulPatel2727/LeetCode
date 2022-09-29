class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> list = new ArrayList<>();
        generateParenthesis(n,0,0,"",list);
        return list;
    }
    public static void generateParenthesis(int n,int open, int close,String ans, List<String>lst){
        if(open == n && close == n){
            // System.out.println(ans);
            lst.add(ans);
            return;
        }
        if(open < n){
            generateParenthesis(n,open+1,close,ans + "(" ,lst);
        }
        if(open > close){
            generateParenthesis(n, open, close+1, ans + ")", lst);
        }
    }
}