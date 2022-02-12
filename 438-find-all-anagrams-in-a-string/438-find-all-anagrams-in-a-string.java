class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<p.length();i++){
    
            char ch = p.charAt(i);
            int nf = map.getOrDefault(ch,0)+1;
            map.put(ch,nf);
        
        }
        
       
        int start=0;
        int e=0;
        int count=map.size();
        int k=p.length();
        List<Integer> ans = new ArrayList<>();
        while(e<s.length()){
            
             char ch = s.charAt(e);
            
            if(map.containsKey(ch)){
                
                
            int nf = map.get(ch)-1;
            map.put(ch,nf);
                
               if(map.get(ch)==0){
                   count--;
               } 
              
            }
            
          
           
          
            
          while(count == 0){
                ch = s.charAt(start);
                if(map.containsKey(ch)){
                    int nf = map.get(ch)+1;
                    map.put(ch, nf);
                    if(map.get(ch) > 0){
                        count++;
                    }
                }
                if(e-start+1 == k){
                    ans.add(start);
                }
                start++;
            }
            
            e++;
            
        }
        return ans;
        
    }
}