import java.util.*;
class Solution {
    public int countGoodSubstrings(String s) {
        
        int k=3;
        int i=0;
        int j=0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        int good=0;
        while(j<s.length()){
           
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            if(j-i+1<k){
                j++;
            }
            
            else if(j-i+1==k){
                
                if(map.size()==k){
                    good++;
                }
                
                char chs= s.charAt(i);
                map.put(chs,map.get(chs)-1);
                
                if(map.get(chs)==0){
                    map.remove(chs);
                }
             
                i++;
                j++;
            }
            
           
            
          
           
           }
           

        
        
        return good;
       
    }
}