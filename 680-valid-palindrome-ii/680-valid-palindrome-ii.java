class Solution {
    public boolean validPalindrome(String s) {
        int st=0;
        int e=s.length()-1;
        
        while(st<e){
            if(s.charAt(st)!=s.charAt(e)){
                return checkPalindrome(s,st+1,e)|| checkPalindrome(s,st,e-1);
            }
            st++;
            e--;
        }
        
        return true;
    }
    
    public boolean checkPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            
            i++;
            j--;
        }
        
        return true;
    }
}