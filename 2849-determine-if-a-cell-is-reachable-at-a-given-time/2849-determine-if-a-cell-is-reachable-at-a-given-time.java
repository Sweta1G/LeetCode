class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int width= Math.abs(sx-fx);
        int height = Math.abs(sy-fy);
        if (width == 0 && height == 0 && t == 1)
            return false;
        int diagMove = Math.min(width, height);
        width -=diagMove;
        height -=diagMove;
        int totalMove = diagMove + width + height;//Either width or height becomes 0
        return totalMove <= t;
    }
}