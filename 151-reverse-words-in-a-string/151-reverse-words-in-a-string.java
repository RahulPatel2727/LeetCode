class Solution {
    public String reverseWords(String s) {
        // s.replaceAll(" +"," ");
        String []arr=s.split("\s+");
        String res ="";
        for(int i=arr.length-1;i>=0;i--){
            res+=arr[i]+" ";
        }
        // String m= res.replaceAll(" +"," ");
        return res.trim();
    
        
    }
}