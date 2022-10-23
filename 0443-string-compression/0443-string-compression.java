class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        if(len == 1){
            return 1;
        }
        // Arrays.sort(chars);
        String res = "";
        int count = 1;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }
            else{
                if(count>1) {
                    res += "" + chars[i] + "" + count;
                }
                else{
                    res += ""+chars[i];
                }
                count = 1;
            }
        }
        if(chars[len-1] != chars[len-2]){
            res += ""+chars[len-1];
        }
        else{
            res += ""+chars[len-1]+""+count;
        }
        for(int i=0;i<res.length();i++){
            chars[i]=res.charAt(i);
        }
        return res.length();
    }
}