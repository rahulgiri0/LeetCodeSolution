class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        Map<Character,Integer> s1map = new HashMap<>();
        Map<Character,Integer> s2map = new HashMap<>();
        
        int k = s1.length();
        
        for(int i=0;i<k;i++){
            char ch = s1.charAt(i);
            s1map.put(ch,s1map.getOrDefault(ch,0)+1);
        }
        
        int start =0;
        int end =0;
        
        while(end<s2.length()){
            
            char ch = s2.charAt(end);
            
            
                s2map.put(ch,s2map.getOrDefault(ch,0)+1);
                
            
            
            if(end-start+1<k){
                end++;
            }
            else if(end-start+1==k){
               
                if(match(s1map,s2map))
                    return true;
                
                 char chs = s2.charAt(start);
            
            if(s2map.containsKey(chs)){
                s2map.put(chs,s2map.getOrDefault(chs,0)-1);
                
                if(s2map.get(chs)==0){
                    s2map.remove(chs);
                }
                
            }

                start++;
                end++;
            }
        }
        
        return false;
    }
    
    public boolean match(Map<Character,Integer> map1,Map<Character,Integer> map2 ){
        
        if(map1.size()!=map2.size()){
            return false;
        }
        
        else{
            
            return map1.equals(map2);
            
//             return map1.entrySet().stream()
//       .allMatch(e -> e.getValue().equals(map2.get(e.getKey())));
            
            
        }
    }
}