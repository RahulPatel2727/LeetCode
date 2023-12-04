class Solution {
    public String largestGoodInteger(String num) {
        // String [] l = {"999","888","777",""}
        String max = "";
        for(int i=0;i<=num.length()-3;i++){
            if(i<=num.length()-3){
                String s = num.substring(i,i+3);
                // System.out.println(s);
                if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2) && s.compareTo(max)>0){
                    max = s;
                }
            }
        }
        return max;
    }
}