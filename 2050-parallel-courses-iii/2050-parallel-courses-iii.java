class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        HashMap<Integer,Integer> hm1 =new HashMap<>();
        for(int i=0;i<time.length;i++)
        {
            hm1.put((i+1),time[i]);
        }            
        int []dist =new int[n+1];        
        ArrayList<ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>>(n+1);
        for(int i=0;i<n+1;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        int []indegree =new int[n+1];
        for(int []t1:relations)
        {
            int u=t1[0];
            int v=t1[1];
            indegree[v]++;
            addEdge(adj,u,v);
        }
        Queue<Integer> q1 =new LinkedList<Integer>();
        for(int i=1;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                q1.add(i);
                dist[i]=hm1.get(i);
            }
        }
        
        int ans=0;
        int max=0;
        while(q1.isEmpty()==false)
        {
            int temp=q1.poll();            
            for(int u:adj.get(temp))
            {
                dist[u]=Math.max(dist[temp]+hm1.get(u),dist[u]);
                indegree[u]--;
                if(indegree[u]==0)
                {
                    q1.add(u);
                }
            }            
        }
       for(int i=0;i<dist.length;i++)
       {
           ans=Math.max(ans,dist[i]);
       }
       return ans; 
    }
    public void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
    }    
}