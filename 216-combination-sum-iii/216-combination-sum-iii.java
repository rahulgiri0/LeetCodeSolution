class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        util(ans,1,new ArrayList<>(), k,n);
        return ans;
    }
    
    public void util(List<List<Integer>> ans ,int idx, List<Integer> comb, int k , int rem){
        
        if(rem==0 && comb.size()==k){
            ans.add(new ArrayList(comb));
            return;
        }
        
        if(rem<0 || comb.size()>k){
            return;
        }
        
        for(int i = idx;i<=9;i++){
            comb.add(i);
            util(ans,i+1,comb,k,rem-i);
            comb.remove(comb.size()-1);
        }
    }
}