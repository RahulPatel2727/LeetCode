class Solution {
    public int lengthOfLastWord(String s) {
        String [] res=s.split(" ");
        return (res[res.length-1]).length();
    }
}