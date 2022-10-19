class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        return isSorted(words, order);
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