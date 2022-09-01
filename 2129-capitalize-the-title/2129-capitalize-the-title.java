class Solution {
    public String capitalizeTitle(String title) {
        String [] str=title.split(" ");
        String res = "";
        for(String s:str){
            s=s.toLowerCase();
            if(s.length()>=3)
                res+=s.substring(0,1).toUpperCase()+s.substring(1)+" ";
            else
                res+=s+" ";
        }
        return res.substring(0,res.length()-1);
    }
}