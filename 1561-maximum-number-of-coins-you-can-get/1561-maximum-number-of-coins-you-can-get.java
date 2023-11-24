class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        // if(piles.length==3)
        //     return piles[1];
        
        int pairs= piles.length/3, sum=0, me= piles.length-2;
        
        for(int i=0; i<pairs; i++){
            sum+= piles[me];
            me= me-2;
        }
        return sum;
    }
}