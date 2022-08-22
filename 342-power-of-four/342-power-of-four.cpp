class Solution {
public:
    bool isPowerOfFour(int n) {
        int c=0,i=0,flag=1;
        while(n>0){
			   if(n&1){ c++;
							if(i%2==0)
							flag=1;
							else 
							{flag=0;
							break; }   
						}
            if(c>1) 
			break;
            n=n>>1;
			i++; }
        if(c==1&&flag==1) 
		return true;
        else 
		return false;
    }
};