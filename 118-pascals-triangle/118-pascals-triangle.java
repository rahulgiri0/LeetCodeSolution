class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        
        
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> p = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    p.add(1);
                }
                
                else if(j<i){
                    p.add(pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
                }
                
            }
            
            pascal.add(p);
        }
        
        return pascal;
    }
}