//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removePair(String s) {
        // code here
        if(s.length()<1)
            return s;
        Stack<Character> q = new Stack<>();
        String res = "";
        q.add(s.charAt(0));
        
        int n = s.length();
        for(int i=1; i<n; i++){
            if(q.isEmpty()){
                q.add(s.charAt(i));
                continue;
            }
            char a = s.charAt(i);
            char b = q.peek();
            if(a == b){
                q.pop();
            }
            else{
                q.push(a);
            }
        }
        if(q.size()==0)
            return "-1";
        res = q.toString().replaceAll("[\\[\\]]", "").replaceAll(",", "");
        return res.replaceAll(" ","");
    }
}
        
