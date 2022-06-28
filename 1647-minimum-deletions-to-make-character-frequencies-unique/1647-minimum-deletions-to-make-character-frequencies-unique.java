class Solution {
    public int minDeletions(String s) {
        
        int count=0;
        int[] fr = new int[26];
        Set<Integer> frSet = new HashSet<>();
        for(int i=0; i<s.length();i++){
            fr[s.charAt(i)-'a']++;
            
        }
        
        for(int i =0 ; i<fr.length ; i++){
            
           
            
             while(fr[i]>0 && frSet.contains(fr[i])){
                fr[i]--;
                
                count++;
            }
            
            frSet.add(fr[i]);
        }
        
   
        
        return count;
    }
}