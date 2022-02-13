class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		ArrayList<Integer> temp = new ArrayList<>();
        combinationSum(candidates,list,0,target,temp);
        return list;
    }
    
    public static void combinationSum(int[] denom, List<List<Integer>> list , int vidx, int target, ArrayList<Integer>temp ){
		
		if(target == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(target <0 ) {
			return;
		}
		
		
		for (int i = vidx; i <denom.length; i++) {
			
			temp.add(denom[i]);
			combinationSum(denom, list, i, target-denom[i], temp);
			temp.remove(temp.size()-1);
			
		}
	}

}