class Solution {
    public int minOperations(String s) {
        int zo=0,oz=0;
        int min = s.length();
        char Z='0', O='1';
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i)!='0'){
                zo++;
            }else if(i%2!=0 && s.charAt(i)=='0'){
                zo++;
            }
            if(i%2==0 && s.charAt(i)!='1'){
                oz++;
            }else if(i%2!=0 && s.charAt(i)=='1'){
                oz++;
            }
        }
        min = Math.min(oz, zo);
        return min;
    }
}