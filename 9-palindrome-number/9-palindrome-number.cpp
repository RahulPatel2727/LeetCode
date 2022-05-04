class Solution {
public:
    bool isPalindrome(int x) 
    {
        if (x<0){return false;}
        
         int temp=x;
        long long res=0;
         while (temp!=0){
             res=res*10;
             res=res+(temp%10);
             temp=temp/10;
         }
        return x==res;
    }
};