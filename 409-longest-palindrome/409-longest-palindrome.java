class Solution {
    public int longestPalindrome(String s) {
        
        int count =0;
        Set<Character> set = new HashSet<>();
        
        for(char ch:s.toCharArray()){
            
            if(set.contains(ch)){
                count++;
                set.remove(ch);
            }
            else
                set.add(ch);
            
        }
        
        if(set.isEmpty())
            return count*2;
        else
            return count*2+1;
    }
}