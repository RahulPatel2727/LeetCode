class Solution {
    public boolean isSelfCrossing(int[] x) {
    if(x == null || x.length < 4){return false;}
    boolean flag = true;
    for(int i = 2; i < x.length - 1; i++){
        if(x[i] == x[i-2]){
            if(x[i+1] >= x[i-1]){
                return true;
            }
            else if(flag && i > 2 && x[i+1] + x[i-3] >= x[i-1]){
                return true;
            }
            flag = false;
        }
        else if(x[i] < x[i-2]){
            if(x[i+1] >= x[i-1]){return true;}
            else if(flag && i > 3 && x[i] + x[i-4] >= x[i-2]){
                if(x[i+1] + x[i-3] >= x[i-1]){
                    return true;
                }
            }
            flag = false;
        }
        else{
            flag = true;
        }
    }
    return false;
    
}
}