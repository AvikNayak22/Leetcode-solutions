//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
public:

    int solve(int n, int k, vector<int> &stalls) {
    
        // Write your code here
        sort(stalls.begin(),stalls.end());
        
        int low = 0;
        int high = stalls[n-1];
        int best = 0;
        
        while(low <= high){
            int mid = (low + high + 1)/2;
            int count = 1;
            int left = 0;
            
            for(int i = 1 ;i < n && count < k;i++){
                if(stalls[i] - stalls[left] >= mid){
                    left = i;
                    count++;
                }
            }
            
            if(count >= k){
                best = mid;
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        
        return best;
    }
};

//{ Driver Code Starts.

int main() {
    int t = 1;
    cin >> t;

    // freopen ("output_gfg.txt", "w", stdout);

    while (t--) {
        // Input

        int n, k;
        cin >> n >> k;

        vector<int> stalls(n);
        for (int i = 0; i < n; i++) {
            cin >> stalls[i];
        }
        // char ch;
        // cin >> ch;

        Solution obj;
        cout << obj.solve(n, k, stalls) << endl;

        // cout << "~\n";
    }
    // fclose(stdout);

    return 0;
}
// } Driver Code Ends