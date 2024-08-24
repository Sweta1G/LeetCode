class Solution {
    public int[] numberGame(int[] nums) {
        int n= nums.length;
        // PriorityQueue<Integer> pq= new PriorityQueue<>();
        // for(int i : nums)
        //     pq.add(i);
        Arrays.sort(nums);
        
        int i=0;
        int ai=0, bi=1;
        while(i<n){
            int a= nums[ai];
            ai+= 2;
            
            int b= nums[bi];
            bi+= 2;
            
            nums[i++]= b;
            nums[i++]= a;
        }
        return nums;
    }
}