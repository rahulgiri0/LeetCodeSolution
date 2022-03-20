class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] visited = new int[graph.length];
        Arrays.fill(visited,-1);
        for(int i=0;i<graph.length;i++){
            if(visited[i]==-1){
                boolean isBipart = util(graph,i,visited);
                if(isBipart==false){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    
    public boolean util(int[][] graph, int src, int[] visited){
        Queue<Pair> q = new LinkedList<>();
        
        q.offer(new Pair(src,0));
        
        while(q.size()>0){
            
            Pair rem = q.poll();
         //   System.out.println(rem.v+"->"+rem.level);
            if(visited[rem.v]==-1){
                visited[rem.v]=rem.level;
                
                for(int e: graph[rem.v]){
                    //System.out.println(e);
                    if(visited[e]==-1){
                        q.offer(new Pair(e,rem.level+1));
                    }
                }
            }
            
            else{
   // System.out.println("vtc"+ visited[rem.v]+ "level:"+ rem.level);
                if(rem.level!=visited[rem.v])
                    return false;
            
            }
        }
        
        
        return true;
    }
}



class Pair{
    int v;
    int level;
    
    public Pair(int v, int level){
        this.v=v;
        this.level=level;
    }
}