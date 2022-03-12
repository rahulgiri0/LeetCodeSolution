class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        
        util(ans,"",0,0,n);
        return ans;
    }
    
    public void util(List<String> ans, String s, int o, int c, int n){
        
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        
        if(o<n){
            util(ans,s+"(",o+1,c,n);
        }
        
        if(c<o){
            util(ans,s+")",o,c+1,n);
        }
    }
}