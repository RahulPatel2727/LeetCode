class Solution {
    public int numTilePossibilities(String tiles) {
        int [] frq = new int[26];
        for(int i=0;i<tiles.length();i++){
            frq[tiles.charAt(i)-'A']++;
        }
        return tilePossibilities(frq,"");
        
    }
     public static int tilePossibilities(int [] frq, String ans){
        // System.out.println(ans);
         int count = 0;
        for (int i = 0; i < frq.length ; i++) {
            if(frq[i]>=1){
                char ch = (char) (i+'A');
                frq[i]--;
                count += tilePossibilities(frq,ans+ch)+1;
                frq[i]++;
            }
        }
         return count;
    }
}