class Solution {
    public List<String> letterCombinations(String digits) {
       
        
        List<String> ans = new ArrayList<>();
         if(digits.isEmpty())
            return ans;
        int idx = 0;
        String[] map =  new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        util(digits,new StringBuilder(""),idx,map,ans);
        return ans;
		
    }
    
    public void util(String digits,StringBuilder output, int idx , String[] map,List<String> ans){
        
        if(idx>=digits.length()){
            String outStr = output.toString();
            ans.add(outStr);
            return;
        }
        
        int num = digits.charAt(idx) -'0';
        String keyValue = map[num];
        
        for(int i=0;i<keyValue.length();i++){
            output = output.append(keyValue.charAt(i));
            util(digits,output,idx+1,map,ans);
           output.deleteCharAt(output.length()-1);
        }
        
    }
}