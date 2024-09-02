class Solution {
    public int trap(int[] height) {
        int n= height.length;
        List<Integer> left= new ArrayList<>(); left.add(height[0]);
        List<Integer> right= new ArrayList<>(); right.add(height[n-1]); int t=0;
        
        for(int i=1; i<n; i++){
            left.add(Math.max(left.get(i-1),height[i]));
        }
        for(int i=n-2; i>=0; i--){
            right.add(Math.max(right.get(t++),height[i]));
        }
        Collections.reverse(right);
        
        int area=0;
        for(int i=0; i<n; i++){
            int h= Math.min(right.get(i),left.get(i))-height[i];
            area+= h;
        }
        return area;
    }
}