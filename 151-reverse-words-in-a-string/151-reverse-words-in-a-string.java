class Solution {
    public String reverseWords(String s) {
        s.replaceAll(" +"," ");
        String []arr=s.split(" ");
        // for(int i=0;i<arr.length;i++){
        //     StringBuilder str = new StringBuilder();
        //     str.append(arr[i]);
        //     str.reverse();
        //     arr[i]=str.toString();
        // }
        String res ="";
        for(int i=arr.length-1;i>=0;i--){
            res+=arr[i]+" ";
        }
        String m= res.replaceAll(" +"," ");
        return m.trim();
    
        
    }
}