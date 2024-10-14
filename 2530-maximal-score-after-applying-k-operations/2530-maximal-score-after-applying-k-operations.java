class Solution {
    public long maxKelements(int[] nums, int k) {
        long res= 0;
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b) -> Integer.compare(b[0],a[0]));
        
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        while(k-->0){
            int curr[]= pq.poll();
            res+= curr[0];
        
            nums[curr[1]]= (int) Math.ceil((curr[0]*1.0)/3);
            pq.add(new int[]{nums[curr[1]],curr[1]});
        }
        return res;
    }
}