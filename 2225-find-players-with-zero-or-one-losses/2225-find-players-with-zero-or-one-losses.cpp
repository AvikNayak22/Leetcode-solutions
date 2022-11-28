class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
      vector<vector<int>> ans(2);
      unordered_map<int,int> losses;
     
        for(vector<int> & match : matches)
        {
           const int winner = match[0];
           const int loser = match[1];
            
            if(!losses.count(winner))
            {
                losses[winner] = 0;
            }
            
            losses[loser]++;
        }
        
        
        for(const auto& [player,number_of_losses] : losses)
        {
            if(number_of_losses < 2)
            {
                ans[number_of_losses].push_back(player);
            }
        }
        
        sort(ans[0].begin(), ans[0].end());
        sort(ans[1].begin(), ans[1].end());
         
        return ans;
    }
};