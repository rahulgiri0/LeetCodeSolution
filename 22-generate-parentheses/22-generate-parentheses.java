class Solution {
    
    public List<String> generateParenthesis(int n) {
        
        
        List<String> ans = new ArrayList<>();
        
        util(n,0,0,new StringBuilder(),ans);
        
        return ans;
    }
    
    public void util(int n, int o,int c, StringBuilder str, List<String> ans){
        if(str.length()==n*2){
            ans.add(str.toString());
            return;
        }
        
        
        
        if(o < n){
            str.append("(");
            util(n,o+1,c,str,ans);
            str.deleteCharAt(str.length()-1);
            
        }
         if(c<o){
             str.append(")");
            util(n,o,c+1,str,ans);
             str.deleteCharAt(str.length()-1);
        }
        
        
    }
}