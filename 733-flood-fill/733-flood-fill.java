class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        
       boolean[][] isvisited= new boolean[image.length][image[0].length];
        int key = image[sr][sc];
        
        return fill(image,sr,sc,newColor,isvisited,key);
        
        
    }
    
    
    public int[][] fill(int[][] image, int sr, int sc, int newColor, boolean[][] isvisited,int key){
         if(sr<0 || sr>=image.length || sc<0 || sc >= image[0].length || image[sr][sc]!=key || isvisited[sr][sc]==true){
            return image;
        }
        
       if(image[sr][sc]==key){

           image[sr][sc]=newColor;
       }
        isvisited[sr][sc]=true;
        fill( image,  sr-1, sc,  newColor, isvisited,key);
        fill( image,  sr, sc-1,  newColor,isvisited,key);
        fill( image,  sr+1, sc,  newColor,isvisited,key);
        fill( image,  sr, sc+1,  newColor,isvisited,key);
        
      
        
        
        
        
        return image;
    }
    
    
    
}