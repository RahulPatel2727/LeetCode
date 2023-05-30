//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
public:
    bool fun(vector<vector<char>>&s,string w,int i,int j,int indx ){
        if(indx==w.length())
        {
            return true;
        }
        if(i<0||j<0||i>=s.size()||j>=s[0].size()||w[indx]!=s[i][j])
        {
            return false;
            
        }
        char temp=s[i][j];
        s[i][j]='@';
        bool a=fun(s,w,i-1,j,indx+1);
        bool b=fun(s,w,i+1,j,indx+1);
        bool c=fun(s,w,i,j-1,indx+1);
        bool d=fun(s,w,i,j+1,indx+1);
        s[i][j]=temp;
        
        return (a||b||c||d);
    }
    bool isWordExist(vector<vector<char>>& s, string w) {
        
        int n=s.size();
        int m=s[0].size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s[i][j]==w[0]&&fun(s,w,i,j,0)){
                   return true;
                }
            }
        }
        return false;
    }
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<char>>board(n, vector<char>(m, '*'));
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				cin >> board[i][j];
		string word;
		cin >> word;
		Solution obj;
		bool ans = obj.isWordExist(board, word);
		if(ans)
			cout << "1\n";
		else cout << "0\n";
	}
	return 0;
}
// } Driver Code Ends