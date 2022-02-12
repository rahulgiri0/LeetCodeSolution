class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            if(st.isEmpty() || st.peek()!=ch){
                st.push(ch);
            }
            else if(st.peek()==ch){
                st.pop();
            }
        }
        
        StringBuffer sb = new StringBuffer("");
        
        util(st,sb);
        
        return sb.toString();
    }
    
    public void util(Stack<Character> stack , StringBuffer sb){
        
        if(stack.size()<=0){
            return;
        }
        
        Character ch = stack.pop();
        util(stack,sb);
        sb.append(ch);
        
    }
}