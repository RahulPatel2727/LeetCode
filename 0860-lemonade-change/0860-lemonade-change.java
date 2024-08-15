class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0, tw = 0;
        for(int bill : bills){
            if(bill == 5){
                f++;
            }else if(bill == 10){
                t++;
                if(f==0) return false;
                else{
                    f--;
                }
            }else{
                tw++;
                if(f == 0 || (f<=2 && t == 0)) return false;
                else if(t>0 && f>0){
                    t--;
                    f--;
                }else if(t == 0 && f > 2){
                    f -= 3;
                }
            }
        }
        return true;
    }
}