class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] coloured = new int[graph.length];
        Arrays.fill(coloured,-1);

        for(int i=0;i<graph.length;i++){
            if(coloured[i]==-1){
                if(!dfs(graph,coloured,i,0)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int[][] graph,int[] coloured,int node,int color){
        coloured[node] = color;
        int[] neighbours = graph[node];
        for(int neighbour:neighbours){
            if(coloured[neighbour]==-1){
                if(!dfs(graph,coloured,neighbour,1-color)){
                    return false;
                }
            }else if(coloured[neighbour]==color){
                return false;
            }
        }
        return true;
    }
}