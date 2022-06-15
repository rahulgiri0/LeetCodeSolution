class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a,b) -> a.length()-b.length());
        
        Map<String,Integer> map = new HashMap<>();
        int res =0;
        for(String word:words){
            
            
            map.put(word,1);
            
            for(int i =0 ;i<word.length();i++){
                StringBuilder sb = new StringBuilder(word);
                String nxt = sb.deleteCharAt(i).toString();
                
                if(map.containsKey(nxt) && map.get(nxt)+1>map.get(word)){
                    map.put(word,map.get(nxt)+1);
                }
                
                
            }
            
            res = Math.max(res,map.get(word));
        }
        
        return res;
    }
}