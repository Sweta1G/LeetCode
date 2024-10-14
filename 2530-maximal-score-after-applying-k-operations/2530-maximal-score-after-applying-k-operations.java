class Solution {
    public long maxKelements(int[] nums, int k) {
        long res= 0;
        // PriorityQueue<int[]> pq= new PriorityQueue<>((a,b) -> Integer.compare(b[0],a[0]));
        PriorityQueue<Integer> pq=  new PriorityQueue<>(Comparator.reverseOrder());
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int i=0;i<nums.length;i++){
            // pq.add(new int[]{nums[i],i});
            pq.add(nums[i]);
        }
        while(k-->0){
//             int curr[]= pq.poll();
//             res+= curr[0];
        
//             nums[curr[1]]= (int) Math.ceil((curr[0]*1.0)/3);
//             pq.add(new int[]{nums[curr[1]],curr[1]});
            int ele = pq.poll();  // Extract the max element
            res += ele;
            pq.add((int) Math.ceil(ele / 3.0));  // Re-insert ceil(ele / 3) into the queue
        }
        return res;
    }
}