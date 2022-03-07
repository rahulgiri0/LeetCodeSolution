class Solution {
    public String truncateSentence(String s, int k) {
        StringBuffer sb = new StringBuffer("");
        
        String[] str = s.split(" ");
        
        for(int i=0;i<str.length;i++){
            if(i<k){
                sb.append(str[i]+" ");
            }
           
        }
        
        String ans = sb.toString();
        return ans.substring(0,ans.length()-1);
    }
}