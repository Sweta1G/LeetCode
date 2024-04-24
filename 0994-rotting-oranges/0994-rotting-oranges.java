class Solution {
    class Pair{
        int x,y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public int orangesRotting(int[][] grid) {
        int fresh=0, time=0;
        Queue<Pair> q= new LinkedList<>();
        
        int n= grid.length, m= grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) fresh++;
                if(grid[i][j]==2) q.add(new Pair(i,j));
            }
        }
        while(!q.isEmpty()){
            int num= q.size();
            for(int i=0;i<num;i++){
                Pair p= q.remove();
                int x= p.x, y= p.y;
                if(x>0 && grid[x-1][y]==1) {grid[x-1][y]=2; fresh--; q.add(new Pair(x-1,y));}
                if(y>0 && grid[x][y-1]==1) {grid[x][y-1]=2; fresh--; q.add(new Pair(x,y-1));}
                if(x<n-1 && grid[x+1][y]==1) {grid[x+1][y]=2; fresh--; q.add(new Pair(x+1,y));}
                if(y<m-1 && grid[x][y+1]==1) {grid[x][y+1]=2; fresh--; q.add(new Pair(x,y+1));}
            }
            if(!q.isEmpty()) time++;
        }
        if(fresh!=0) return -1;
        return time;
    }
}