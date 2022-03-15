class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count=0;
        
        for(int i=0;i<stones.length();i++){
            if(isJewel(stones.charAt(i),jewels))
                count++;
            
            
        }
        
        return count;
        
    }
    
    public boolean isJewel(char ch, String jewels) {

        for(int i=0;i<jewels.length();i++)
        {
                if(ch==jewels.charAt(i))
                    return true;
        } 
        
        return false;
    
    }
}