class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
        if(n == 1)
            return new int[]{1,2,3,4,5,6,7,8,9};
    List<Integer> ans = new ArrayList<>();
        for(int num =1; num<10;num++){
            
            util(n-1,num,k,new StringBuilder(""+num),ans);
        }
        
        
        return ans.stream().mapToInt((e)->e).distinct().toArray();
    }
    
    public void util(int n,int num, int k,StringBuilder numStr,List<Integer> ans){
        
        if(n == 0){
            ans.add(convertToInt(numStr));
            return;
        }
        
        Integer tailDigit = num % 10;
        if(tailDigit+k<=9){
        numStr.append(tailDigit+k);
        
        util(n-1,convertToInt(numStr),k,numStr,ans);
        numStr.deleteCharAt(numStr.length()-1);
        }
        if(tailDigit-k >=0)
        {
           numStr.append(tailDigit-k);
             util(n-1,convertToInt(numStr),k,numStr,ans);
             numStr.deleteCharAt(numStr.length()-1);
        }
  
    }
    
    public int convertToInt(StringBuilder str){
        return Integer.parseInt(str.toString());
    }
}
