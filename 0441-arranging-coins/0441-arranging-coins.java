class Solution {
    public int arrangeCoins(int n) {
        if(n==1 || n==2) return 1;
        int i = 1; // which row we are on
		while(n > 0){ // checking to see if we have used all our coins
			i++; // increasing our row
			n = n-i; // adding coins to our row
		}
		return i-1;
        
    }
}