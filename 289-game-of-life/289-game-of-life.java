class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n= board[0].length;
        
        int[][] direction = new int[][]{
            {-1,0},
            {-1,-1},
            {0,-1},
            {1,-1},
            {1,0},
            {1,1},
            {0,1},
            {-1,1}
        };
        
        
        int[][] next = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                int liveCount=0;
                for(int[] dir:direction){
                    int x = dir[0]+i;
                    int y = dir[1]+j;
                    
                    if(x>=0 && y>=0 && x<m && y<n && board[x][y]==1)
                        liveCount++;
                    
                    
                }
                
                if(board[i][j]==0 && liveCount==3){
                        next[i][j]=1;
                    }
                    else if(board[i][j]==1 && (liveCount==2 || liveCount==3))
                        next[i][j]=1;
            }
        }
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=next[i][j];
            }
        }
    }
}