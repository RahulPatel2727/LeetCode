//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std;

// } Driver Code Ends
class Solution{
public:
    int check(int n)
 {
     if(n == 1 or n==7 or n ==10)
     return 1;
     
     else if(n < 10)
     return -1;
     
     int sum = 0;
     while(n) {
         int x = n%10;
         x*=x;
         n/=10;
         sum+=x;
     }
     check(sum);
 }
    int nextHappy(int N){
        // code here
        for(int i = N+1;i<INT_MAX;i++) {
            if(check(i) != -1)
            return i;
        }
        return -1;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin>>N;
        Solution ob;
        cout << ob.nextHappy(N) << endl;
    }
    return 0; 
}
// } Driver Code Ends