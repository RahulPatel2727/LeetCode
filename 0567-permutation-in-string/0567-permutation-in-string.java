class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        if(s1.length()==s2.length()){
            char [] ch = s1.toCharArray();
            Arrays.sort(ch);
            s1=new String(ch);
            
            ch = s2.toCharArray();
            Arrays.sort(ch);
            s2 = new String(ch);
            
            return s1.equals(s2);
        }
        char [] c = s1.toCharArray();
        Arrays.sort(c);
        s1 = new String(c);
        for(int i=0;i<s2.length()-s1.length()+1;i++){
            String temp = s2.substring(i,i+s1.length());
            char [] t = temp.toCharArray();
            Arrays.sort(t);
            temp = new String(t);
            if(s1.equals(temp)){
                return true;
            }
        }
        return false;
    }
}