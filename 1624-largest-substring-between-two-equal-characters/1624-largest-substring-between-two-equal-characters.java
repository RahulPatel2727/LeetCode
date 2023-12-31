class Solution {
    public int maxLengthBetweenEqualCharacters(String str) {
        int max = -1;
        for(int i = 0; i<str.length(); i++){
            if(str.lastIndexOf(str.charAt(i)) == i) continue;
            max = Math.max(str.lastIndexOf(str.charAt(i)) - i - 1, max);
        }
        return max;
    }
}