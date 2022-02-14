class Solution {
    public int findCircleNum(int[][] isConnected) {
     
        int count=0;
        boolean[] visited = new boolean[isConnected.length];
        
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                util(isConnected,i,visited);
                count++;
            }
        }
        
        return count;
        
    }
        
        public void util(int[][] graph, int src, boolean[] visited){
            
            
            visited[src]=true;
            for(int i=0;i<graph.length;i++){
                if(!visited[i] && graph[src][i]==1){
                    util(graph,i,visited);
                }
            }
        }
    
}