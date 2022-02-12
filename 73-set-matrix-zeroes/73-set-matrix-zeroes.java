class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        int[] rz = new int[matrix.length];
        int[] cz = new int[matrix[0].length];
        
        for(int i=0;i<matrix.length;i++){
            
            
            for(int j=0;j<matrix[i].length;j++){


                if(matrix[i][j]==0){
                    
                    
                   
                        cz[j]=-1;
                    
                    
                    
                        rz[i]=-1;
                    
                    
                   
                    
                }
                
            
            }
        }
        
             
       
        
        
        for(int i=0;i<matrix.length;i++){
            
            
            for(int j=0;j<matrix[i].length;j++){

              
                if(rz[i]==-1 || cz[j]==-1){
                    matrix[i][j]=0;
                }
            
            }
        }
        
        
        
        
        
    }
}