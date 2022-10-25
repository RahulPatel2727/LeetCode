class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1 = "";
        String res2 = "";
        for(String s : word1){
            res1 += s;
        }
        for(String s : word2){
            res2 += s;
        }
        return res1.equals(res2);
    }
}