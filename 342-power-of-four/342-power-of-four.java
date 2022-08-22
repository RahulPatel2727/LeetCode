class Solution {
    public boolean isPowerOfFour(int n) {

        for(int i=0;i<Math.pow(4,i);i++){
            if(n<0)
                return false;
            if(Math.pow(4,i)==n)
                return true;
            if(Math.pow(4,i)>n)
                return false;
        }
        return false;
    }
}