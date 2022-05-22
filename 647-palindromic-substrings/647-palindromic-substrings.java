class Solution {
    public int countSubstrings(String s) {
        int count= 0;
        
        for(int i =0; i<s.length();i++){
            
           count= substring(s,i,i,count);
            count= substring(s,i,i+1,count);
        }
        return count;
    }
    
    public int substring(String s, int left, int right, int count){
        
        while(left>=0 && right< s.length() && s.charAt(left ) == s.charAt(right)){
            
            count++;
            left--;
            right++;
        }
        
        return count;
    }
}