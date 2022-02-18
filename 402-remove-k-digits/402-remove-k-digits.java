class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> st = new Stack<>();
        if(k>=num.length()){
            return "0";
        }
        
        for(int i=0;i<num.length();i++){
            
            
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            
            st.push(num.charAt(i));
            
            
            
        }
        
       while(k>0){
           st.pop();
           k--;
       }
        
        StringBuffer sb = new StringBuffer("");
        
      
       
     util(st,sb);
    //System.out.println(sb);
        
        while( sb.length()>1 && sb.charAt(0)=='0'){
            sb.delete(0,1);
            
        }
        
        return sb.toString();
    }
    
    public void util(Stack<Character> st, StringBuffer sb){
        
        if(st.size()==0){
            return ;
        }
        char ch = st.pop();
        util(st,sb);
        sb.append(ch);
    }
}