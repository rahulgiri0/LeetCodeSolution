class Solution {
    public int[][] generateMatrix(int n) {
        int val =1;
        int[][] ans = new int[n][n];
        
        int minRow = 0;
		int maxRow = n - 1;
		int minCol = 0;
		int maxCol = n - 1;

		int nel = n*n;
		int count = 0;
        
        while(count<nel){
        for(int i=minCol;i<=maxCol && count < nel;i++){
            ans[minRow][i]=val;
            val++;
            count++;
        }
        minRow++;
        for(int i=minRow ; i<=maxRow && count<nel;i++){
            ans[i][maxCol]=val;
            val++;
            count++;
        }
        maxCol--;
        
        for(int i=maxCol;i>=minCol && count<nel;i--){
            ans[maxRow][i]=val;
            val++;
            count++;
        }
        
        maxRow--;
        
        for(int i=maxRow;i>=minRow && count<nel;i--){
            ans[i][minCol]=val;
            val++;
            count++;
        }
            minCol++;
        }
        
        
        return ans;
        
    }
}