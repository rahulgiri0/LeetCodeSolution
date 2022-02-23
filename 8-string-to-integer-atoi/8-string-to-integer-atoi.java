class Solution {
    public int myAtoi(String s) {
        int j=0;
        char ch=' ';
        int sum=0;
 
        while(j<s.length() && s.charAt(j)==' '){
            j++;
        }
        
        if(j<s.length() && s.charAt(j)=='-'){
            ch=s.charAt(j);
            j++;
        }
        else  if(j<s.length() && s.charAt(j)=='+'){
            ch=s.charAt(j);
            j++;
        }
        
        
            
            while(j<s.length() && Character.isDigit(s.charAt(j))){
                int digit =s.charAt(j)-'0';
                if ((sum > Integer.MAX_VALUE / 10) || 
                (sum == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {     
                   
                return  ch=='-' ?   Integer.MIN_VALUE: Integer.MAX_VALUE;
            }
                
                sum=sum*10+digit;
               j++;
            }
            
             
        
        
        if(ch=='-'){
            sum=sum-sum-sum;
        }
        
        return sum;
        
    }
}