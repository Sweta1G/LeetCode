class Solution {
    public int findCenter(int[][] edges) {
        int a= edges[0][0];
        if(edges[1][0]==a) return a;
        else if(edges[1][1]==a) return a;
        else return edges[0][1];
    }
}