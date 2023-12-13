class Solution {
    private boolean check1(int[][] mat, int x, int y){
        
        int count=0, ans=0;
        for(int i=0; i<mat.length; i++){
            if(i==x) continue;
            if(mat[i][y]==0) count++;
        }
        if(count==mat.length-1) ans++;
        
        count=0;
        for(int j=0; j<mat[x].length; j++){
            if(j==y) continue;
            if(mat[x][j]==0) count++;
        }
        if(count==mat[x].length-1) ans++;
        if(ans==2)return true;
        return false;
    }
    public int numSpecial(int[][] mat) {
        
        int res=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==1 && check1(mat, i, j)){
                    res++;
                }
            }
        }
        return res;
    }
}