class Solution {
    public int[] numberGame(int[] nums) {
        int n= nums.length;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i : nums)
            pq.add(i);
        
        int i=0;
        while(pq.size()>0 && i<n){
            int a= pq.poll();
            int b= pq.poll();
            
            nums[i++]= b;
            nums[i++]= a;
        }
        return nums;
    }
}