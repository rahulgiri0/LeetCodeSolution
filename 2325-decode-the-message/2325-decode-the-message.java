class Solution {
    public String decodeMessage(String key, String message) {
        
  key=   key.replace(" ","");
        
        StringBuilder sb = new StringBuilder("");
        
        
        Map<Character,Character> map = new HashMap<>();
        
        char ch = 'a';
        for(int i =0; i<key.length();i++){
            
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),ch);
                ch++;
            }
        }
        
       
        
     for(int i= 0; i<message.length();i++){
        String s = "";
         
         if(message.charAt(i)!= ' '){
             s+=map.get(message.charAt(i));
         }
         else
             s+=" ";
         
                sb.append(s);
         
     }
        
        return sb.toString();
   
    }
}