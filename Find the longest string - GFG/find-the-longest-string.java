//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String longestString(int n, String[] arr) {
        // code here
      return findLongestString(arr);
    }
    public static String findLongestString(String[] arr) {
        // Sort the array of strings in lexicographic order
        Arrays.sort(arr);

        // Create a set to store all the prefixes of the strings in the array
        Set<String> prefixSet = new HashSet<>(Arrays.asList(arr));
//        for (String str : arr) {
//            for (int i = 0; i < str.length(); i++) {
//                prefixSet.add(str.substring(0, i + 1));
//            }
//        }

        // Find the longest string in the array which has all its prefixes present in the prefix set
        String longestString = "";
        for (String str : arr) {
            boolean allPrefixesPresent = true;
            for (int i = 1; i < str.length(); i++) {
                if (!prefixSet.contains(str.substring(0, i))) {
                    allPrefixesPresent = false;
                    break;
                }
            }
            if (allPrefixesPresent && str.length() > longestString.length()) {
                longestString = str;
            }
        }

        return longestString;
    }
}
        
