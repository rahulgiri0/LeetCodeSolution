class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0; i<t.length();i++){
            char ch = t.charAt(i);
          if(!map.containsKey(ch))
              return false;
            
            else{
                map.put(ch,map.getOrDefault(ch,0)-1);
                
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }
            
            
        }
        
        return map.isEmpty();
    }
}