class Solution {
    public int maxArea(int[] height) {
        int area= 0;
        int left=0, n = height.length, right= n-1;
        while(left<right){
            int width= right- left;
            int h= Math.min(height[left],height[right]);
            if(height[right]>height[left]) left++;
            else right--;
            area= Math.max(area,width*h);
        }
        return area;
    }
    
    //     1 8 6 2 5 4 8 3 7
    // 1 - 1 8 8 8 8 8 8 8 8
    //     8 8 8 8 8 8 8 7 7  -1
}