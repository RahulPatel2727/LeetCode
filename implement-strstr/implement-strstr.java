class Solution {
    public int strStr(String a, String b) {
        int dif = a.length()-b.length();
        for(int i=0;i<=dif;i++){
            for(int j = 0;j<b.length();j++){
                if(b.charAt(j) != a.charAt(i + j)){
                    break;
                }
                if(j == b.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
}