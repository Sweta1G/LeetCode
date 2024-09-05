class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m= rolls.length;
        int sum_M= 0;
        for(int i:rolls)
            sum_M+= i;
        
        int x= (mean*(n+m)) - sum_M;
        
        int res[]= new int[n];
        if((x+sum_M)%(n+m)!=0) return new int[]{};
        
        Arrays.fill(res, 1);

        // Calculate the remaining sum after filling the array with 1s
        int remainingSum = x - n;

        // Distribute the remaining sum to make the elements fit within [1, 6]
        int index = 0;
        while (remainingSum > 0) {
            // Find how much we can add to the current element (max 5, because it's already 1)
            int addValue = Math.min(5, remainingSum);
            res[index] += addValue;
            remainingSum -= addValue;
            index++;
            if(index>=n) break;
        }
        if(remainingSum!=0) return new int[]{};
        return res;
        
    }
}