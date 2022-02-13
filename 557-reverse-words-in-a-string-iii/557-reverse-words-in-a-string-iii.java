class Solution {
    public String reverseWords(String s) {
        int i=0;
        int j=0;
        String ans="";
        while(i<s.length() && j<s.length()){
            
            if(s.charAt(j)!= ' '){
                 if(j==s.length()-1){
                    ans = ans+reverse(s.substring(i,j+1));
                } 
                j++;
            }
            else{
                if(j>=s.length()-1){
                    ans = ans+reverse(s.substring(i,j+1));
                }
               else{ 
              ans = ans+reverse(s.substring(i,j))+" ";
               }
                
                j++;
                i=j;
            }
            
        }
        
        return ans;
    }
    
    
    public String reverse(String st){
        String str="";
        System.out.println(st);
        for(int i =st.length()-1; i>=0;i--){
            str=str+st.charAt(i);
        }
        System.out.println(str);
        return str;
    }
}