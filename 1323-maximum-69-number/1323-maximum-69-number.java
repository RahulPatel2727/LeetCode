class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        if(s.indexOf('6')==-1){
            return num;
        }
        s = s.substring(0,s.indexOf('6'))+'9'+s.substring(s.indexOf('6')+1);
        int res = Integer.parseInt(s);
        return res;
    }
}