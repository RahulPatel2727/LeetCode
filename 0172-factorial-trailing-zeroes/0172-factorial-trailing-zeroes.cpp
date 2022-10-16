class Solution {
public:
    int trailingZeroes(int n) {
     
        int count = 0;
    
    while(n)
    {
        int i = 5;
        n=n/5;
        count = count + n;
        i=i*i;
        
    }
        return count;
    }
};