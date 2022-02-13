class Solution {
    public String firstPalindrome(String[] words) {
        int palindromeAt=0;
        boolean is=false;
        for(int i=0;i<words.length;i++){
                is = isPalindrome(words[i]);
            if(is){
                palindromeAt=i;
                break;
            }
        }
        
        if(is==false){
            return "";
        }
          
        return words[palindromeAt];
    }
    
   public boolean isPalindrome(String str){
       
        String s="";
       for(int i= str.length()-1;i>=0;i--){
           s=s+str.charAt(i);
       }
       System.out.println(s);
       
       if(s.equals(str)){
           return true;
       }
       else
           return false;
    }
}