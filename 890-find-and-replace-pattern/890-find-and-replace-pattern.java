class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        
        String p = util(pattern);
     
        
        for(String word:words){
            if(util(word).equals(p)){
                ans.add(word);
            }
        }
        
        return ans;
    }
    
    public String util(String pattern){
        Map<Character,Integer> map = new HashMap<>();
        int count =0;
        String ans ="";
        for(int i=0 ; i<pattern.length();i++){
            
            map.putIfAbsent(pattern.charAt(i),count++);
           ans+=map.get(pattern.charAt(i));
        }
        
        
        return ans;
    }
}