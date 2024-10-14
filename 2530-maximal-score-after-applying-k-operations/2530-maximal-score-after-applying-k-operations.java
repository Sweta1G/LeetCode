class Solution {
    public long maxKelements(int[] nums, int k) {
        long res= 0;
        PriorityQueue<Integer> pq=  new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        while(k-->0){
            int ele = pq.poll();
            res += ele;
            pq.add((int) Math.ceil(ele / 3.0));
        }
        return res;
    }
}