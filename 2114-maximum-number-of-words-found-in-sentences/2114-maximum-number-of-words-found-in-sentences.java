class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<sentences.length;i++){
            int word = wordCount(sentences[i]);
            max = max>word?max:word;
            
        }
        return max;
    }
    
    public int wordCount(String s){
        
        int j=0;
        int count=0;
        while(j<s.length()){
            
            if(s.charAt(j)!=' '){
                j++;
            }
            else{
                count++;
                j++;
            }
        }
        
        return count+1;
    }
}