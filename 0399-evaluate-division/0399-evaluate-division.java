class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Graph graph = new Graph();
        for(int i = 0; i < equations.size(); i++){
            graph.addNeighbors(equations.get(i).get(0), equations.get(i).get(1), values[i]);
        }
        double[] res = new double[queries.size()];
        Set<String> visited = new HashSet<>();
        int idx = 0;
        for(List<String> query : queries){
           res[idx++] = dfs(query.get(0), query.get(1), graph.graph, visited); 
        }
        return res;
    }
    
    public double dfs(String node1, String node2, Map<String, Node> graph, Set<String> visited){
        if(!graph.containsKey(node1) || !graph.containsKey(node2)){
            return -1;
        }
        if(node1.equals(node2)){
            return 1;
        }
        visited.add(node1);
        double val = 0;
        double min = Double.MAX_VALUE;
        Node gNode = graph.get(node1);
        for(Dnode n : gNode.neighbors){
            if(visited.contains(n.node.val)){
                continue;
            }
            val = n.distance * dfs(n.node.val, node2, graph, visited);
            if(val > 0 && min > val){
                min = val;
            }
        }
        visited.remove(node1);
        return min == Double.MAX_VALUE ? -1 : min;
    }
    
    static class Graph{
        Map<String, Node> graph = new HashMap<>();
        
        public void addNeighbors(String val1, String val2, double distance){
            Node node1 = getNode(val1);
            Node node2 = getNode(val2);
            
            node1.neighbors.add(new Dnode(distance, node2));
            node2.neighbors.add(new Dnode((1 / distance), node1));
        }
        
        public Node getNode(String val){
            if(!graph.containsKey(val)){
                graph.put(val, new Node(val));
            }
            return graph.get(val);
        }
    }
    
    
    static class Node{
        String val;
        List<Dnode> neighbors;
        
        public Node(String val){
            this.val = val;
            neighbors = new ArrayList<>();
        }
    }
    
    static class Dnode{
        double distance;
        Node node;
        
        public Dnode(double distance, Node node){
            this.distance = distance;
            this.node = node;
        }
    }
}