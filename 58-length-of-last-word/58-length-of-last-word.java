class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        
        
        String ans = str[str.length-1];
        return ans.length();
    }
}