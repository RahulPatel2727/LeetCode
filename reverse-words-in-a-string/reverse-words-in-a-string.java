class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split("\\s+");
        reverse(arr);
        String ans = "";
        for(String it : arr){
            if(it.length()!=0){
                ans = ans +" "+ it;
            }
        }
        ans = ans.trim();
        return ans;
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