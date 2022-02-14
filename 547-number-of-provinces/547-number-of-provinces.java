class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        ArrayList<Edge>[] graph = new ArrayList[isConnected.length];
        
        for(int i=0; i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        
        
        for(int i=0;i<graph.length;i++){
            for(int v=0;v<graph.length;v++){
                
                if(isConnected[i][v]==1){
                graph[i].add(new Edge(i,v));
                graph[v].add(new Edge(v,i));
                }
            }
        }
        
        boolean[] visited = new boolean[graph.length];
        int count =0;
        for(int v=0;v<graph.length;v++){
            if(!visited[v]){
                util(graph,v,visited);
                count++;
            }
        }
        
        return count;
        
        
    }
    
    public void util(ArrayList<Edge>[] graph,int src,boolean[] visited ){
        
        
        visited[src]=true;
        for(Edge edge : graph[src]){
            if(!visited[edge.nbr]){
                util(graph,edge.nbr,visited);
            }
        }
    }
    
    
    
}

class Edge{
    int src;
    int nbr;
    
    public Edge(int src, int nbr){
        this.src=src;
        this.nbr=nbr;
        
    }
}