class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        int[][] sorted = new int[n][2];

        for(int i= 0; i<n; i++)
            sorted[i] = new int[]{nums[i], i};

        Arrays.sort(sorted,(a,b) -> a[0]-b[0]);

        boolean[] marked = new boolean[n];
        long sum = 0;
        for(int arr[] : sorted){
            int x= arr[0], id= arr[1];
            if(!marked[id]){
                sum+=x;
                if(id+1<n && !marked[id+1]) marked[id+1]= true;
                if(id-1>=0 && !marked[id-1]) marked[id-1]= true;
                marked[id]= true;
            }
        }
        return sum;
    }
}