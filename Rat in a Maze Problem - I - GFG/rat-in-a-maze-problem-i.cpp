//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++

class Solution{
    public:
    vector<string> findPath(vector<vector<int>> &m, int n) {
        // Your code goes here
        vector<string> ans;
        vector<vector<int>> visited(n,vector<int>(n,0));
        
        
        if(m[0][0] == 1) solve(0,0,m,n,ans,"",visited);
        
        
        return ans;
    }
    
    
    void solve(int i,int j,vector<vector<int>> &arr,int n , vector<string> &ans, string move , vector<vector<int>> &visited){
       
       if( i == n-1 && j == n-1){
           ans.push_back(move);
           return;
       }
       
       
       //down
       if(i+1 < n && !visited[i+1][j] && arr[i+1][j] == 1){
           visited[i][j] = 1;
           solve(i+1,j,arr,n,ans,move + "D" , visited);
           visited[i][j] = 0;
       }
       
       //left
       if(j-1 >= 0 && !visited[i][j-1] && arr[i][j-1] == 1){
           visited[i][j] = 1;
           solve(i,j-1,arr,n,ans,move + "L",visited);
           visited[i][j] = 0;
       }
       
       //right
       if(j+1 < n && !visited[i][j+1] && arr[i][j+1] == 1){
           visited[i][j] = 1;
           solve(i,j+1,arr,n,ans,move + "R",visited);
           visited[i][j] = 0;
       }
       
       //up
       if(i-1 >=0 && !visited[i-1][j] && arr[i-1][j] == 1){
          visited[i][j] = 1;
          solve(i-1,j,arr,n,ans,move + "U" ,visited);
          visited[i][j] = 0; 
       }
    }
};

    


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<vector<int>> m(n, vector<int> (n,0));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cin >> m[i][j];
            }
        }
        Solution obj;
        vector<string> result = obj.findPath(m, n);
        sort(result.begin(), result.end());
        if (result.size() == 0)
            cout << -1;
        else
            for (int i = 0; i < result.size(); i++) cout << result[i] << " ";
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends