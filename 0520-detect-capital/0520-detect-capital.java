class Solution {
    public boolean detectCapitalUse(String word) {
        char first = word.charAt(0);
        if(Character.isUpperCase(first)){
           if(isCapital(word)){
               return true;
           }
            if(isLower(word,1,word.length()-1) ){
                return true;
            }
            if(!isCapital(word) && !isLower(word,1,word.length()-1)){
                return false;
            }
        }
        char ch = word.charAt(word.length()-1);
        if(Character.isUpperCase(ch)){
            return isCapital(word);
        }
        if(Character.isLowerCase(ch)){            
            return isLower(word,0,word.length()-1);
        }
        return false;
    }
    
    public static boolean isLower(String st,int ss,int ee){
        int s=ss,en=ee;
        while(s<=en){
            if(!Character.isLowerCase(st.charAt(s)) || !Character.isLowerCase(st.charAt(en))){
                return false;
            }
            s++;en--;
        }
        return true;
    }
    
    public static boolean isCapital(String st){
        int s = 0;int en = st.length()-1;
        while(s<=en){
            if(!Character.isUpperCase(st.charAt(s)) || !Character.isUpperCase(st.charAt(en))){
                return false;
            }
            s++;en--;
        }
        return true;
    }
}