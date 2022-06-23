// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String>list=new ArrayList<>();
        int pow=(int)Math.pow(2,s.length());
        for(int i=0;i<pow;i++){
            if(i==0)continue;
            String temp="";
            for(int j=0;j<s.length();j++){
                if((i&(1<<j))!=0){
                    temp+=s.charAt(j);
                }
            }
            list.add(temp);
        }
        Collections.sort(list);
        // list.add();
        return list;
    }
}