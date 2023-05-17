class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = strs[0];
        String e = strs[strs.length-1];
        for(int i=0;i<Math.min(s.length(), e.length()); i++){
            if(s.charAt(i)!=e.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s;
    }
}