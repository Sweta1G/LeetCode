class Solution {
    public int findComplement(int n) {
        int res= 0, power= 0;
        while(n>0){
            int last= n%2;
            int c= last==0? 1:0;
            res+= (c * (int) Math.pow(2,power));
            power++;
            n/= 2;
        }
        
        return res;
    }
}