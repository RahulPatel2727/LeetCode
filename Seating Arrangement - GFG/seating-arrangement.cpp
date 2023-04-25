//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    bool is_possible_to_get_seats(int n, int m, vector<int>& seats){
        // Write your code here.
         if(n==0)return true;
        
        if(m==1 && n==1 && seats[0]!=1) return true;
        if(m==1 && n==1 && seats[0]==1) return false;
        int i=0;
        while(i<m && n>0){
            if(seats[i]==1){
                i++;
                continue;
            }
            if(i<m-1 && seats[i+1]!=1  && i>0 && seats[i-1]!=1){
                seats[i]=1;
                
                n--;
            }
            if(i==0 && seats[i+1]!=1){
                seats[i]=1;
                n--;
            }
            if(i==m-1 && seats[i-1]!=1){
                seats[i]=1;
                n--;
            }
            if(n==0){
                return true;
            }
            
            
            i++;
            
        }
        
        
        return false;
    }
};

//{ Driver Code Starts.

int main(){

    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int m;
        cin >> m;
        vector<int> seats(m);
        for (int i = 0; i < m; i++) {
            cin >> seats[i];
        }
        Solution obj;
        if (obj.is_possible_to_get_seats(n, m, seats)) {
            cout << "Yes" << endl;
        }
        else {
            cout << "No" << endl;
        }
    }
}

// } Driver Code Ends