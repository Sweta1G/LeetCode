class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> res= new ArrayList<>();
        int x= 0;
        int n= mat.length, m= mat[0].length;
        int t= m*n, f=0;
        int sr=0, sc= 0, er= n-1, ec= m-1;
        while(f<t){
            if(x==0){
                for(int i=sc; i<=ec; i++){
                    f++;
                    res.add(mat[sr][i]);
                }
                sr++;
            }
            else if(x==1){
                for(int i=sr; i<=er; i++){
                    res.add(mat[i][ec]);
                    f++;
                }
                ec--;
            }
            else if(x==2){
                for(int i=ec; i>=sc; i--){
                    res.add(mat[er][i]);
                    f++;
                }
                er--;
            }
            else{
                for(int i=er; i>=sr; i--){
                    res.add(mat[i][sc]);
                    f++;
                }
                sc++;
            }
            x= (x+1)%4;
        }
        return res;
    }
}