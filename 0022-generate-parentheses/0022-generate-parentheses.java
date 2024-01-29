class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 1, 0, 0, "", ans);
        return ans;
    }
    public void generate(int n, int count, int o, int c, String s, List<String> ans){
        if(o < c) return;
        if(count > 2*n){
            ans.add(s);
            return;
        }
        if(o < n){
            generate(n, count+1, o+1, c, s+'(', ans);
        }
        if(o > 0  && c <= o){
            generate(n, count+1, o, c+1, s+')', ans);
        } 
    }
}