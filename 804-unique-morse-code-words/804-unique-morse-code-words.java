class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       
        Set<String> tf = new HashSet<>();
        for(String word:words){
            StringBuilder sb = new StringBuilder();
            for(int i =0; i<word.length();i++){
                sb.append(morse[word.charAt(i)-'a']);
            }
            
            tf.add(sb.toString());
        }
        
        return tf.size();
    }
}