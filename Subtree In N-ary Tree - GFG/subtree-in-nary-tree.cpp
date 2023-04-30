//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

class Node{
public:
    int data;
    vector<Node*> children;
    Node(int val){
        data=val;
    }
};

class N_ary_Tree{
public:
    Node *root;
    int size;
    N_ary_Tree(){
        root=NULL;
        size=0;
    }
    Node *add(int new_key,Node *parent_key=NULL){
        Node *new_node = new Node(new_key);
        if(parent_key == NULL){
            root = new_node;
            size = 1;
        }
        else{
            parent_key->children.push_back(new_node);
            size += 1;
        }
        return new_node;
    }
};


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    unordered_map<string, int> mp;
    
    string helper(Node* root) {
        if(root->children.size() == 0) {
            string str = to_string(root->data);
            mp[str]++;
            return str;
        }
        
        vector<Node*> temp = root->children;
        sort(temp.begin(), temp.end(), [](Node* left, Node* right) {
            return left->data < right->data; 
        });

        string res = "";
        bool first = true;
        for(auto child: temp) {
            string curr = helper(child);
            res += "(" + curr + ")";
        }
        
        res += to_string(root->data);
        mp[res]++;
        
        return res;
    }

    int duplicateSubtreeNaryTree(Node *root){
        // Code here
        if(!root) return 0;
        helper(root);
        int cnt = 0;
        for(auto it: mp) {
            if(it.second > 1) cnt++;
        }
        return cnt;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        if(i==0){
            string p;
            getline(cin,p);
        }
        string str;
        getline(cin,str);
        stringstream st(str);
        vector<string> s;
        string y;
        while(st>>y){
            s.push_back(y);
        }
        N_ary_Tree *tree = new N_ary_Tree();
        Node *curr;
        queue<Node*> q;
        for(int i=0;i<s.size();i++){
            if (i == 0){
                curr=tree->add(stoi(s[0]));
            }
            else if(s[i] == " "){
                continue;
            }
            else if(q.size() and s[i] == "N"){
                curr = q.front();
                q.pop();
            }
            else if(s[i] != "N"){
                q.push(tree->add(stoi(s[i]), curr));
            }
        }
        Solution ob;
        int res = ob.duplicateSubtreeNaryTree(tree->root);
        cout<<res<<endl;
    }
}
// } Driver Code Ends