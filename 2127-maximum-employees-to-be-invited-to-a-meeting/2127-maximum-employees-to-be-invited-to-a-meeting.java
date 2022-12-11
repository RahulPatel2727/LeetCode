class Solution {
    class Vertex {
        int id;
        int length;
        int inDegree;
        Vertex next;
        boolean processed;
        
        public Vertex(int id){
            this.id = id;
            this.length = 1;
            this.inDegree = 0;
            this.next = null;
            this.processed = false;;
        }
    }
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        Vertex[] vertices = new Vertex[n];
        
        for(int i = 0; i < n; i++){
            vertices[i] = new Vertex(i);
        }
        
        for(int i = 0; i < n; i++){
            int source = i;
            int dest = favorite[i];
            
            vertices[source].next = vertices[dest];
            vertices[dest].inDegree++;
        }
        
        Queue<Vertex> sources = new LinkedList<>();
        for(Vertex vertex : vertices){
            if(vertex.inDegree == 0){
                sources.offer(vertex);
            }
        }
        
        while(!sources.isEmpty()){
            Vertex vertex = sources.poll();
            Vertex next = vertex.next;
            
            next.length = Math.max(next.length, vertex.length + 1);
            if(--next.inDegree == 0){
                sources.offer(next);
            }
            
            vertex.processed = true;
        }
		
        int maxCycleLength = 0;
        int couplesWithFollowers = 0; //couldn't think of a better name lol
        for(Vertex vertex : vertices){
            if(vertex.processed){
                continue;
            }
            if(vertex.next.next == vertex){
                couplesWithFollowers += vertex.next.length + vertex.length;
                vertex.processed = true;
                vertex.next.processed = true;
            }
            else{
                maxCycleLength = Math.max(maxCycleLength, determineCycleLength(vertex));
            }
        }
        return Math.max(maxCycleLength, couplesWithFollowers);
    }
    
    public int determineCycleLength(Vertex vertex){
        int cycleLength = 0;
        while(!vertex.processed){
            vertex.processed = true;
            vertex = vertex.next;
            cycleLength++;
        }
        return cycleLength;
    }
}