class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String word: words)
            map.put(word,map.getOrDefault(word,0)+1);
        
        
        int ans =0;
        
        for(String word:map.keySet()){
           int i =0;
        int j =0; 
            while(i<s.length() && j<word.length()){
                
                if(s.charAt(i) == word.charAt(j)){
                    i++;
                    j++;
                }
                else
                    i++;
                
                
            }
            
            if(j == word.length()){
                ans+= map.get(word);
            }
            
        }
        
        return ans;
    }
}