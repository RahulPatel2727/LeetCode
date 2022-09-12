class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int st = 0,en = tokens.length-1;
        int score=0;
        while(st<=en){
            if(power>=tokens[st]){
                power-=tokens[st];
                ++score;
                ++st;
            }
            else {
                if(st!=en && score>0) {
                    power+=tokens[en];
                    // en--;
                    score--;
                }
                en--;
            }
        }
         return score>0?score:0;
        
    }

}