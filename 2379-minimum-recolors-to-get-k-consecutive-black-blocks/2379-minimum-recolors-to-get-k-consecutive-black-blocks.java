class Solution {
    public int minimumRecolors(String blocks, int k) {
//         int n= blocks.length();
//         int i=0, j=0, w=0, count= Integer.MAX_VALUE;
        
//         while(j<n){
//             if(blocks.charAt(j)=='W') w++;
//             if(j-i+1==k){
//                 count= Math.min(count,w);
//                 if(blocks.charAt(i)=='W') w--;
//                 i++;
//             }
//             j++;
//         }
//         return count;
        int ans = Integer.MAX_VALUE;
        int n = blocks.length();
        int count = 0;
        for(int i=0; i<k; i++) {
            if(blocks.charAt(i)=='W') {
                count++;
            }
        }
        ans = Math.min(count, ans);
        for(int i=k; i<n; i++) {
            int ws = i-k;
            if(blocks.charAt(ws)=='W') {
                count--;
            }
            if(blocks.charAt(i)=='W') {
                count++;
            }
            ans = Math.min(count, ans);
        }
        return ans;
    }
}