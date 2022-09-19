class Solution {
    public String largestPalindromic(String num) {
       return palMax(num);
    }
    private static String palMax(String s){
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(Character.getNumericValue(s.charAt(i)),mp.getOrDefault(Character.getNumericValue(s.charAt(i)),0)+1);
        }
        int []key=new int[mp.size()];
        int []val=new int[mp.size()];
        int i=0;
        for(int k:mp.keySet()){
            key[i]=k;
            val[i]=mp.get(k);
            i++;
        }
        int maxOdd=-1;
        String res = "";
        for(int t = key.length-1;t>=0;t--) {
            if (val[t]%2!=0 && maxOdd<key[t]) {
                maxOdd = key[t];
            }
            if (val[t] >= 2) {
                int temp = val[t] / 2;
                while (temp-- > 0) {
                    res += key[t];
                }
            }
        }
        if(maxOdd!=-1)
            res += maxOdd;
        int z=0;
        if(res.charAt(0)=='0') {
            while(z<res.length() && res.charAt(z)=='0'){
                z++;
            }
        }
        res = res.substring(z);
        if(res=="") {
            res="0";
            return res;
        }
        if(maxOdd!=-1)
            res += reverse(res.substring(0, res.length() - 1));
        else
            res += reverse(res.substring(0));
        return res;
    }
    
    
    private static String reverse(String s ){
        return new StringBuilder().append(s).reverse().toString();
    }
    
}