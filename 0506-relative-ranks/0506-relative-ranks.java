class Pair{
    int ele, idx;
    Pair(int e, int i){
        this.ele= e;
        this.idx= i;
    }
}
class Solution {
    public class PairComparator implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            return p2.ele-p1.ele;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        int n= score.length;
        if(n==1) return new String[]{"Gold Medal"};
        else if(n==2){
            if(score[0]>score[1]) return new String[]{"Gold Medal","Silver Medal"};
            else return new String[]{"Silver Medal","Gold Medal"};
        }
        
        String prize[]= new String[n];
        PriorityQueue<Pair> pq= new PriorityQueue<>(new PairComparator());
        
        for(int i=0; i<n; i++)
            pq.add(new Pair(score[i],i));
        
        int rank=1;
        while(pq.size()>0 && rank<=n){
            if(rank==1)
                prize[pq.peek().idx]= "Gold Medal";
            else if(rank==2)
                prize[pq.peek().idx]= "Silver Medal";
            else if(rank==3)
                prize[pq.peek().idx]= "Bronze Medal";
            else
                prize[pq.peek().idx]= String.valueOf(rank);
            rank++;
            pq.poll();
        }
        return prize;
    }
}