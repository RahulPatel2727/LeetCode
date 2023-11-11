class Graph {
    
    //not my
    List<List<Pair<Integer, Integer>>> adjList;
    public Graph(int n, int[][] edges) {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());
        for (int[] e : edges)
            adjList.get(e[0]).add(new Pair<>(e[1], e[2]));
    }

    public void addEdge(int[] edge) {
        adjList.get(edge[0]).add(new Pair<>(edge[1], edge[2]));
    }

    public int shortestPath(int node1, int node2) {
        int n = adjList.size();
        var pq = new PriorityQueue<List<Integer>>(Comparator.comparingInt(list -> list.get(0)));
        int[] costForNode = new int[n];
        Arrays.fill(costForNode, Integer.MAX_VALUE);
        costForNode[node1] = 0;
        pq.offer(Arrays.asList(0, node1));

        while (!pq.isEmpty()) {
            var curr = pq.poll();
            int currCost = curr.get(0);
            int currNode = curr.get(1);

            if (currCost > costForNode[currNode]) {
                continue;
            }
            if (currNode == node2) {
                return currCost;
            }
            for (var neighbor : adjList.get(currNode)) {
                int neighborNode = neighbor.getKey();
                int cost = neighbor.getValue();
                int newCost = currCost + cost;

                if (newCost < costForNode[neighborNode]) {
                    costForNode[neighborNode] = newCost;
                    pq.offer(Arrays.asList(newCost, neighborNode));
                }
            }
        }

        return -1;
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */