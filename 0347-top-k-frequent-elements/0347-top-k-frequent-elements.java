class Pair{
    int ele, freq;
    Pair(int e, int f){
        this.ele= e;
        this.freq= f;
    }
}
class Solution {
    public class PairComparator implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            return p1.freq-p2.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        int[] res= new int[k];
        HashMap<Integer,Integer> mp= new HashMap<>();
        PriorityQueue<Pair> pq= new PriorityQueue<>(new PairComparator());
        
        for(int i: nums)
            mp.put(i,mp.getOrDefault(i,0)+1);
        
        for(HashMap.Entry<Integer,Integer> e: mp.entrySet()){
            pq.add(new Pair(e.getKey(), e.getValue()));
            if(pq.size()>k) pq.poll();
            
        }
        while(!pq.isEmpty())
            res[--k]= pq.poll().ele;
        
        return res;
    }
}