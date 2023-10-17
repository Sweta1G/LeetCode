/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int pick=1;
        if(n==1) return pick;
        
        int j=n;
        while(pick<j){
            int mid= pick+(j-pick)/2;
            if(guess(mid)==0){
                return mid;  
            }
            else if(guess(mid)==1){
                pick=mid+1;
            }
            else{
                j=mid;
            }
        }
            return pick;
        
    }
}