
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int res[]= {0,Integer.MAX_VALUE};
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int currMax= Integer.MIN_VALUE;
        
        for(int i=0; i<nums.size(); i++){
                currMax= Math.max(currMax,nums.get(i).get(0));
                pq.add(new int[]{nums.get(i).get(0),i,0});
        }
        
        while(true){
            int curr[]= pq.poll();
            int currMin= curr[0], listIDX= curr[1], eleIDX= curr[2];
            
            if(currMax-currMin < res[1]-res[0] || (currMax - currMin == res[1] - res[0] && currMin < res[0])){
                res[0]= currMin;
                res[1]= currMax;
            }
            
            if(eleIDX+1<nums.get(listIDX).size()){
                int nextVal= nums.get(listIDX).get(eleIDX+1);
                pq.add(new int[]{nextVal,listIDX,eleIDX+1});
                currMax= Math.max(nextVal,currMax);
            }
            else break;
            
        }
        
        
        return res;
    }
}