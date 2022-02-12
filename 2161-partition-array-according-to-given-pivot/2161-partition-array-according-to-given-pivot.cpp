class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        
        vector<int> small;
        vector<int> big;
        vector<int> eql;
        
        for (auto a : nums) {
            if (pivot > a) {
                small.push_back(a);
            } else if (pivot < a) {
                big.push_back(a);
            } else {
                eql.push_back(a);
            }
        }
        vector<int> ans;
        for (auto a : small)  ans.push_back(a);
        for (auto a : eql)  ans.push_back(a);
        for (auto a : big)  ans.push_back(a);
        
        
        return ans;
    }
};