class Solution {
    public boolean isAlienSorted(String[] words, String order) {
       
        int[] arr = new int[26];
        int seq = 0;
        for(char ch : order.toCharArray())
        {
            arr[ch-'a'] = seq++;
        }
        for(int i=0;i<words.length-1;i++)
        {
            String curr = words[i];
            String next = words[i+1];

            int len = Math.min(curr.length(),next.length());

            if(len != curr.length() && len == next.length() && curr.startsWith(next))
            {
                return false;
            }

            for(int l=0;l<len;l++)
            {
                if(arr[curr.charAt(l)-'a'] > arr[next.charAt(l)-'a'])
                {
                    return false;
                }
                if(arr[curr.charAt(l)-'a'] < arr[next.charAt(l)-'a'])
                {
                    break;
                }
            }
        }
        return true;
    }
    public static boolean isSorted(String[] words, String order) {
        boolean f = false;
        for(int i = words.length-1;i>0;i--){
            String g = words[i];
            String s = words[i-1];
            if(g.equals(s)){
                continue;
            }
            boolean equal = false;
            int min = (g.length()<s.length()) ? g.length() : s.length();
            for (int j = 0; j < min; j++) {
                int gg = order.indexOf(g.charAt(j));
                int ss = order.indexOf(s.charAt(j));
                if(gg>ss){
                    f = true;
                    break;
                }
                else if(gg<ss){
                    return false;
                }
                else if(gg == ss){
                    equal = true;
                }
            }
            
            // if break then continue
            if(f){
                f = false;
                continue;
            }
            
            // for equal at min length check
            if(equal && s.length()>g.length()){
                return false;
            }
        }
        return true;
    }
}