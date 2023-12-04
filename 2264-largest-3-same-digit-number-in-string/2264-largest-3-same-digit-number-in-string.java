class Solution {
    public String largestGoodInteger(String num) {
        String [] l = {"999","888","777","666","555","444","333","222","111","000"};
        for(String str : l){
            if(num.contains(str)){
                return str;
            }
        }
        
        return "";
    }
}