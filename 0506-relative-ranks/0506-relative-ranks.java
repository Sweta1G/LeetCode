class Solution {
    // int dup[];
    // private static int[] reverse(int dupe[], int n) { 
    //     int[] b = new int[n]; 
    //     int j = n; 
    //     for (int i = 0; i < n; i++) { 
    //         b[j - 1] = dupe[i]; 
    //         j = j - 1; 
    //     } 
    //     return b;
    // }
    private int findPosition(ArrayList<Integer> dupe, int x){
        
        for(int i=0; i<dupe.size(); i++){
            if(dupe.get(i)==x) return i+1;
        }
        return -1;
    }
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> dupe = new ArrayList<>();
        for(int i:score)
            dupe.add(i);
        Collections.sort(dupe);
        Collections.reverse(dupe);
        String[] res= new String[score.length];
        
        for(int i=0;i<res.length;i++){
            int rank= findPosition(dupe,score[i]);
            if(rank==1) res[i]= "Gold Medal";
            else if(rank==2) res[i]= "Silver Medal";
            else if(rank==3) res[i]= "Bronze Medal";
            else res[i]= String.valueOf(rank); 
        }
        return res;
    }
    
    // 10,3,8,9,4
    // 10,9,8,4,3
}