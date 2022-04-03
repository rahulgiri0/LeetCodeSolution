class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int key = image[sr][sc];
        boolean[][] isVisited = new boolean[image.length][image[0].length];
        
        floodFillUtil(image,sr,sc,newColor,key,isVisited);
        return image;
    }
    
    public void floodFillUtil(int[][] image, int sr, int sc, int newColor, int key,boolean[][] isVisited ){
        
       if(sr<0 || sr>=image.length || sc<0 || sc >= image[0].length || image[sr][sc]!=key || isVisited[sr][sc]==true)
            return ;
        
       if(image[sr][sc]==key){

           image[sr][sc]=newColor;
       }
        isVisited[sr][sc]=true;
        floodFillUtil(image, sr,sc-1,newColor,key,isVisited);
        floodFillUtil(image, sr+1,sc,newColor,key,isVisited);
        floodFillUtil(image, sr,sc+1,newColor,key,isVisited);
        floodFillUtil(image, sr-1,sc,newColor,key,isVisited);
        
        
       
    }
}