class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int time=0;
        for(int i : left) {
            time= Math.max(time, i);
        }
        for(int i:right) {
            time= Math.max(time, n-i);
        }
        return time;
    }
}