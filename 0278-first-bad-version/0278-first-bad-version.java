/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=0, high= n, res= -1;
        while(low<=high){
            int m= low+(high-low)/2;
            if(isBadVersion(m)) {res= m; high= m-1;}
            else low= m+1;
        }
        
        return res;
    }
}