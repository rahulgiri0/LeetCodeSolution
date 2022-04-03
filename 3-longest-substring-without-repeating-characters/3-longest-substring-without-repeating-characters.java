import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       HashMap<Character, Integer> map = new HashMap<>(); 
    int maximum_length = 0;
 
   
    int start = 0;
 int end = 0;
    while( end < s.length())
    {
    
      if(map.containsKey(s.charAt(end)))
      {
        
        start = Math.max(start, map.get(s.charAt(end)) + 1);
      }
 
    
      map.put(s.charAt(end), end);
      maximum_length = Math.max(maximum_length, end-start + 1);
        end++;
    }
        
        
    return maximum_length;
            

    }
}