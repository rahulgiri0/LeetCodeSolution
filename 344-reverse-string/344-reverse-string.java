class Solution {
    public void reverseString(char[] s) {
        
        
        reverse(s,s.length-1,0);
        System.out.println(s);
        
        
    }
    
   public void  reverse(char[] s, int idx, int adx){
        
       if(idx<s.length/2 ){
           return;
       }
       
       char temp=s[adx];
       s[adx]=s[idx];
       s[idx]=temp;
       
       
       
       reverse(s,idx-1,adx+1);
       
      
       
    }
}