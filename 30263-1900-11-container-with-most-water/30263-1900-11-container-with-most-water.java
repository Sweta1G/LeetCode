class Solution {
    public int maxArea(int[] height) {
        int n= height.length, left=0, right= n-1, area= 0;
        while(left<right){
            int w= right-left;
            int h= Math.min(height[left],height[right]);
            if(height[right]>height[left]) left++;
            else right--;
            area= Math.max(area,w*h);
        }
        return area;
    }
}