class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n= blocks.length();
        int i=0, j=0, w=0, b= 0, count= Integer.MAX_VALUE;
        
        while(j<n){
            if(blocks.charAt(j)=='W') w++;
            // else b++;
            
            if(j-i+1==k){
                count= Math.min(count,w);
                if(blocks.charAt(i)=='W') w--;
                i++;
            }
            j++;
        }
        return count;
    }
}