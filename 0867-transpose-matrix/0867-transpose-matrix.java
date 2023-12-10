class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] trans= new int[matrix[0].length][matrix.length];
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                // if(i==j)
                    trans[j][i]= matrix[i][j];
                // else
                    // trans[i][j]= matrix[j][i];
            }
        }
        return trans;
    }
}