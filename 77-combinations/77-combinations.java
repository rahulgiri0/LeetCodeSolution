class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        
        combiUtil(combs,new ArrayList<Integer>(), 1,n,k);
        
        return combs;
    }
    
    public void combiUtil(List<List<Integer>> combs,ArrayList<Integer> comb, int s,int n,int k){
        
        if(k==0){
            combs.add(new ArrayList<>(comb));
            return;
        }
        
        for(int i=s;i<=n;i++){
            
            comb.add(i);
            combiUtil(combs, comb, i+1,n,k-1);
            comb.remove(comb.size()-1);
        }
        
        
    }
}