class Solution {
    // private int findPosition(ArrayList<Integer> dupe, int x){
        
//         for(int i=0; i<dupe.size(); i++){
//             if(dupe.get(i)==x) return i+1;
//         }
//         return -1;
//     }
    public String[] findRelativeRanks(int[] score) {
//         ArrayList<Integer> dupe = new ArrayList<>();
//         for(int i:score)
//             dupe.add(i);
//         Collections.sort(dupe);
//         Collections.reverse(dupe);
//         String[] res= new String[score.length];
        
//         for(int i=0;i<res.length;i++){
//             int rank= findPosition(dupe,score[i]);
//             if(rank==1) res[i]= "Gold Medal";
//             else if(rank==2) res[i]= "Silver Medal";
//             else if(rank==3) res[i]= "Bronze Medal";
//             else res[i]= String.valueOf(rank); 
//         }
//         return res;
        int n = score.length;
        
        int maxScore = 0;
        for (int i = 0 ; i < n ; i++) {
            maxScore = Math.max(maxScore, score[i]);
        }
        
        int[]  score2Index = new int[maxScore+1];
        
        for (int i = 0 ; i < n ; i++) {
            score2Index[score[i]] = i+1;
        }
        
        String[] ans = new String[n];
        
        int place = 1;
        
        for (int i = maxScore ; i >= 0 ; i--) {
            
            if (score2Index[i] == 0) continue;
                
            int actualIndex = score2Index[i] - 1;
            if (place == 1) {
                ans[actualIndex] = "Gold Medal";
            } else if (place == 2) {
                ans[actualIndex] = "Silver Medal";
            } else if (place == 3) {
                ans[actualIndex] = "Bronze Medal";
            } else {
                ans[actualIndex] = String.valueOf(place);
            }
            place++; 
        }
        
        return ans;
    }
    
    // 10,3,8,9,4
    // 10,9,8,4,3
}