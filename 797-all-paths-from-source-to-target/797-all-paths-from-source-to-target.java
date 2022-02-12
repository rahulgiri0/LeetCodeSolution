class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        ArrayList<Edge>[] aGraph = new ArrayList[graph.length];
        
        
        for(int i=0;i<graph.length;i++){

        aGraph[i]=new ArrayList<>();
        }
        
        
        
        for(int i=0;i<graph.length;i++){
            
            for(int j=0;j<graph[i].length;j++){
              
                aGraph[i].add(new Edge(i,graph[i][j]));
            }
        }
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        
       // System.out.println(aGraph[0].get(0).src+" "+ aGraph[0].get(0).nbr);
        getPath(aGraph,0,graph.length-1,ans,path);
        return ans;
    }
    
    
    public void getPath(ArrayList<Edge>[] aGraph, int src,int dest, List<List<Integer>> ans, List<Integer> path){
        
        if(src==dest){
            ans.add(new ArrayList<>(path));
          
            return ;
        }
       
        
       
        for(Edge edge:aGraph[src]){
             path.add(edge.nbr);
            getPath(aGraph,edge.nbr,dest,ans,path);
            path.remove(path.size()-1);
          
        }

      
    }
}



class Edge{
    int src;
    int nbr;
    
    public Edge(int src,int nbr){
        this.nbr=nbr;
        this.src=src;
    }
}