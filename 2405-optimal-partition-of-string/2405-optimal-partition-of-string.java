class Solution {
    public int partitionString(String s) {
        int ans = 0;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (temp.contains(""+ch)) {
                ans++;
                // System.out.println(temp);
                temp = ""+ch;
            }
            else{
                temp += ch;
            }
        }
        if(temp.length()!=0){
            ans++;
        }
        return ans;
    }
}