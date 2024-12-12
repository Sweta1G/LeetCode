class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i : gifts)
            pq.add(i);
        long sum= 0;
        while(k-- > 0){
            int x= pq.poll();
            int t= (int) Math.floor(Math.sqrt(x));
            pq.add(t);
        }
        while(pq.size()>0)
            sum+= pq.poll();
        return sum;
    }
}