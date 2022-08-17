class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set <String> set = new HashSet<>();
        
        for(int i=0;i<words.length;i++){
            String temp="";
            for(int j=0;j<words[i].length();j++){
                int ascii=Integer.valueOf(words[i].charAt(j));
                ascii=ascii%97;
                temp+=code[ascii];
            }
            set.add(temp);
        }
        
        
        return set.size();
    }
}