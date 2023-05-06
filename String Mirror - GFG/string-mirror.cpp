//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    string stringMirror(string str){
        string s ="";
        s+=str[0];
        for(int i=1; i<str.size(); i++){
            if(i==1 && str[i]<str[i-1])s+=str[i];
            else if(i>1 && str[i]<=str[i-1])s+=str[i];
            else break;
        }
        string t = s;
        reverse(t.begin(),t.end());
        return s+t;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        string str;
        cin>>str;
        Solution ob;
        string res=ob.stringMirror(str);
        cout<<res<<endl;
    }
}
// } Driver Code Ends