class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Comparator<int[]> customComp = new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                if (a[1]==b[1])
                    return b[0]-a[0];
                else
                    return b[1]-a[1];
            }
        };
        int soldier= 0;
        PriorityQueue<int[]> pq = new PriorityQueue(customComp);
        for(int row = 0; row< mat.length; row++){
            for(int col=0; col<mat[0].length; col++){
                if(mat[row][col]==1)
                    soldier++;
            }
            pq.offer(new int[]{row, soldier});
            while(pq.size()>k)
                pq.poll();
            soldier=0;
        }
        int[] result = new int[pq.size()];
        int i = k-1;
        while(!pq.isEmpty()){
            int[] ele=pq.poll();
            result[i--]=ele[0];
        }
        return result;
    }
}