class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans= new ArrayList<>();
      helper(s.toCharArray(), ans, 0);
        return ans;
    }
    
    public void helper(char[] chs, List<String> res, int idx) {
        if (idx == chs.length) {
            res.add(new String(chs));
            return;
        }
        if (chs[idx] >= '0' && chs[idx] <= '9') {
            helper(chs, res, idx + 1);
            return;
        }
        
        chs[idx] = Character.toLowerCase(chs[idx]);
        helper(chs, res, idx + 1);
        
        chs[idx] = Character.toUpperCase(chs[idx]);
        helper(chs, res, idx + 1);
    }
}