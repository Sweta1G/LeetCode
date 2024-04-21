class Solution {
    private boolean dfs(ArrayList<ArrayList<Integer>> graph, int src, int dest, boolean[] vis){
        if(src==dest) return true;
        vis[src]= true;
        for(int i :graph.get(src)){
            if(vis[i]==false){
                if(dfs(graph,i,dest,vis)) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean visited[]= new boolean[n];
        return dfs(graph,source,destination,visited);
    }
}