class Solution {
    public int getLucky(String s, int k) {
        String str = "";
        for(int i=0; i<s.length(); i++){
            str=str + (s.charAt(i)-'a' + 1);
        }
        System.out.println(str);
        int temp = 0;
        for(int i=0;i<str.length();i++){
            temp += Character.getNumericValue(str.charAt(i));
        }
        k--;
        System.out.println(temp);
        while(k-->0){
            int val = temp;
            int sum=0;
            while(val!=0){
                sum+=val%10;
                val/=10;
            }
            temp = sum;
        }
        return temp;
    }
}