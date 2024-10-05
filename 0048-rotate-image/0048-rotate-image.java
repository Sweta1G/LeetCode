class Solution {
    public void rotate(int[][] mat) {
        int n= mat.length, m= mat[0].length;
        
         for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][m - 1 - j];
                mat[i][m - 1 - j] = temp;
            }
        }
        
        
    }
}