class Solution {
    public int maxEqualRowsAfterFlips(int[][] mat) {
        int m= mat.length, n= mat[0].length;
        HashMap<String,Integer> mp= new HashMap<>();
        for(int[] currRow : mat){
            String row="";
            for(int i=0; i<n; i++){
                if(currRow[0]==currRow[i])
                    row+="T";
                else row+="F";
            }
            mp.put(row,mp.getOrDefault(row,0)+1);
        }
        int res= 0;
        for(int freq : mp.values())
            res= Math.max(res,freq);
        return res;
    }
}