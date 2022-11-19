class Solution {
    public int countEven(int num) {
        int c=0,i=1;
        while(i<=num){
            c+=digSum(i);
            i++;
        }
        return c;
    }
    
    public int digSum(int n){
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        if(sum%2==0){
            return 1;
        }
        else 
            return 0;
    }
}