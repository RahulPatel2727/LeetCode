class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int n = s.length();
        int st=n-1, en=n-1;
        while(true){
            while(en>=0 && s.charAt(en) == ' '){
                en--;
            }
            st = en;
            while(st>=0 && s.charAt(st)!=' '){
                st--;
            }
            ans += " "+s.substring(st+1,en+1);
            en = st;
            if(st<=0 || en<=0){
                break;
            }
        }
        return ans.trim();
    }
    public static void reverse(String [] arr){
        int s=0, e= arr.length-1;
        while(s<=e){
            String t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            e--;s++;
        }
    }
}