class Solution
{
    public:
        string longestCommonPrefix(vector<string> &strs)
        {
            string prefix = strs[0];
            int n = strs.size();
            for (int i = 1; i <= n - 1; i++)
            {
                prefix = commonPrefix(prefix, strs[i]);
            }
            return prefix;
        }
    string commonPrefix(string s1, string s2)
    {
        string res = "";
        int n1 = s1.size(), n2 = s2.size();
        int minlen = min(n1, n2);
        for (int i = 0; i < minlen; i++)
        {
            if (s1[i] != s2[i])
            {
                break;
            }
            else
            {
                res = res + s1[i];
            }
        }
        return res;
    }
};