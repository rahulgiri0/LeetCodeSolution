class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        
        if(s.length()==0 ){
            return true;
        }
       
        
        int i=0;
        int j=0;
        
        while(j<t.length() && i<s.length()){
            
            if(s.charAt(i)==t.charAt(j)){
               // System.out.println(i);
                i++;
                j++;
            }
            else
                j++;
        }
        
        
        
        if(i==s.length()){
            return true;
        }
        else
            return false;
    }
}