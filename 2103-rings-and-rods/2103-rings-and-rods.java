class Solution {
    public int countPoints(String rings) {
        String [] arr = {"","","","","","","","","","",};
        for(int i=0;i<rings.length()-1;i+=2){
            char ch = rings.charAt(i);
            int indx = Character.getNumericValue(rings.charAt(i+1));
            if(!arr[indx].contains(""+ch)){
                arr[indx]+=""+ch;
            }
        }
        int count =0;
        for(String st : arr){
            if(st.length()==3){
                count ++;
            }
        }
        return count;
    }
}