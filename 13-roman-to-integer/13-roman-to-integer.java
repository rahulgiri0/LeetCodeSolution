class Solution {
    public int romanToInt(String s) {
        int last = getValue(s.charAt(s.length()-1));
    
        for(int i = s.length()-2;i>=0;i--){
            
            if(getValue(s.charAt(i))<getValue(s.charAt(i+1))){
                last-=getValue(s.charAt(i));
                
            }
            
            else{
                last+=getValue(s.charAt(i));
            }
            
          
        }
        
        return last;
    }
    
    public int getValue(char ch){
        
        Map<Character,Integer> map = new HashMap<>();
        
        map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
        
        return map.get(ch);
        
    }
}