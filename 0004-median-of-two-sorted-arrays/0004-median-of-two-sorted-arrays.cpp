class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int total = nums1.size() + nums2.size();
        if (total % 2 == 0) {
            return (findKth(total / 2 + 1, nums1, nums2, 0, 0) + findKth(total / 2, nums1, nums2, 0, 0)) / 2.0;
        } else {
            return findKth(total / 2 + 1, nums1, nums2, 0, 0);
        }
    }
    
    int findKth(int k, vector<int>& nums1, vector<int>& nums2, int s1, int s2) {
        if (s1 >= nums1.size()) {
            return nums2[s2 + k - 1];
        }
        if (s2 >= nums2.size()) {
            return nums1[s1 + k - 1];
        }
        if (k == 1) {
            return min(nums1[s1], nums2[s2]);
        }
        int m1 = s1 + k / 2 - 1;
        int m2 = s2 + k / 2 - 1;
        int mid1 = m1 < nums1.size() ? nums1[m1] : INT_MAX;
        int mid2 = m2 < nums2.size() ? nums2[m2] : INT_MAX;
        if (mid1 < mid2) {
            return findKth(k - k / 2, nums1, nums2, m1 + 1, s2);
        } else {
            return findKth(k - k / 2, nums1, nums2, s1, m2 + 1);
        }
    }
};