class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& nums) {
      return helper(nums,nums.size(),0);
    }
    
    int helper(vector<int>&nums,int size,int count)
    {
        if(size < 3) return 0;
        
        if(nums[size-1] - nums[size-2] == nums[size-2] - nums[size-3])
        {
            count++;
            return count+helper(nums,size-1,count);
        }
        else
        {
            return helper(nums,size-1,0);
        }
    }
};