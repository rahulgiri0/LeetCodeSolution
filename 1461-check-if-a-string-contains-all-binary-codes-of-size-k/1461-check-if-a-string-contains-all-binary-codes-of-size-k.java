class Solution {
    public boolean hasAllCodes(String s, int k) {
       int  subStringsLength = 1<<k;
        
        Set<String> set = new HashSet<>();
        
        for(int i=k;i<=s.length();i++){
            String subs = s.substring(i-k,i);
            
            if(!set.contains(subs)){
                set.add(subs);
                subStringsLength--;
                
                if(subStringsLength==0)
                    return true;
            }
        }
        
        return false;
        
        
        
        
    }
}