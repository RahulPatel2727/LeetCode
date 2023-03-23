//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
          
            String S = read.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.removeReverse(S); 
            System.out.println(ans);
        }
    } 
} 

// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    String removeReverse(String s) { 
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(!hm.containsKey(c))
            hm.put(c,0);
            hm.put(c,hm.get(c)+1);
        }
        int i=0,j=n-1;
        boolean b=true;
        char c;
        String s1="",s2="";
        int ct=0;
        while(i<=j)
        {
            if(b)
            c=s.charAt(i++);
            else
            c=s.charAt(j--);
            if(hm.containsKey(c) && hm.get(c)>1)
            {
                ct++;
                hm.put(c,hm.get(c)-1);
                if(hm.get(c)==1)
                hm.remove(c);
                if(b)
                b=false;
                else
                b=true;
            }
            else
            {
                if(b)
                s1+=c;
                else
                s2=c+s2;
            }
        }
        StringBuffer sb=new StringBuffer(s1+s2);
        if(ct%2!=0)
        sb.reverse();
        return sb.toString();
    }
} 

//{ Driver Code Starts.

// } Driver Code Ends