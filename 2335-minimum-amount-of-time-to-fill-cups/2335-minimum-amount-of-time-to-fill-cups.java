class Pair{
    int ele;
    char c;
    Pair(int e, char c){
        this.ele= e;
        this.c= c;
    }
}
class Solution {
    public class PairComparator implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            return p2.ele-p1.ele;
        }
    }
    public int fillCups(int[] amount) {
        PriorityQueue<Pair> pq= new PriorityQueue<>(new PairComparator());
        
        for(int i=0; i<amount.length; i++){
            if(i==0){
                if(amount[i]==0) continue;
                pq.add(new Pair(amount[i],'c'));
            }
            else if(i==1){
                if(amount[i]==0) continue;
                pq.add(new Pair(amount[i],'w'));
            }
            else if(i==2){
                if(amount[i]==0) continue;
                pq.add(new Pair(amount[i],'h'));
            }
        }
                                    
        
        int time= 0;
        while(pq.size()>1){
            // time++;
            Pair x= pq.poll();
            Pair y= pq.poll();
            
            if(x.ele == 0 && y.ele== 0) break;
            else if(y.ele==0)
                pq.add(new Pair(x.ele-1,x.c));
            else if(x.ele == 0)
                pq.add(new Pair(y.ele-1,y.c));
            else{
                pq.add(new Pair(x.ele-1, x.c));
                pq.add(new Pair(y.ele-1, y.c));
            }
            time++;
        }   
        if(pq.size()==1) time+= pq.peek().ele;
        return time;
    }
}