class Solution {
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        
        Arrays.sort(edgeList, (a,b) -> a[2] - b[2]);
        
        Queue<Integer> heap = new PriorityQueue<>((a,b) -> queries[a][2] - queries[b][2]);
        for (int i = 0; i < queries.length; i++) {
            heap.offer(i);
        }
        
        DisjointSet ds = new DisjointSet(n);
        int currentEdge = 0;
        
        while (!heap.isEmpty()) {
            int q = heap.poll();
            
            while (currentEdge < edgeList.length && edgeList[currentEdge][2] < queries[q][2]) {
                int v = edgeList[currentEdge][0], u = edgeList[currentEdge][1];
                ds.union(v, u);
                currentEdge++;
            }
            
            result[q] = ds.find(queries[q][0]) == ds.find(queries[q][1]);
        }
        return result;
    }
}

class DisjointSet {
    private int[] parent;
    private int[] rank;

    public DisjointSet(int n) {
        this.parent = new int[n];
        this.rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public boolean union(int v, int u) {
        int sv = find(v), su = find(u);
        if (sv == su) return false;

        if (rank[sv] > rank[su]) {
            rank[sv] += rank[su];
            parent[su] = sv;
        } else {
            rank[su] += rank[sv];
            parent[sv] = su;
        }
        return true;
    }

    public int find(int v) {
        if (parent[v] == v) return v;
        parent[v] = find(parent[v]);
        return parent[v];
    }
}