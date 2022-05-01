class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return (stringBuilder(s).equals(stringBuilder(t)));
    }
    
    private String stringBuilder(String str){
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!='#')
                st.push(ch);
            
            else if(!st.isEmpty() && ch=='#')
                st.pop();
            
        }
        
        return String.valueOf(st);
    }
}