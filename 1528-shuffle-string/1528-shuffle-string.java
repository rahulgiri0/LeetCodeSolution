class Solution {
    public String restoreString(String s, int[] indices) {
        char[] carr = new char[indices.length];
        
        for(int i=0;i<indices.length;i++){
            char ch = s.charAt(i);
            carr[indices[i]]=ch;
        }
        
       StringBuffer sb = new StringBuffer("");
        for(int i=0;i<carr.length;i++){
            sb.append(carr[i]);
        }
        
        
        return sb.toString();
    }
}