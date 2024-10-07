class Solution {
    private int[] nextSmallest(int[] heights, int n){
        int res[]= new int[n];
        Stack<Integer> st= new Stack<>();
        st.push(-1);
        for(int i= n-1; i>=0; i--){
            while(st.peek()!=-1 && heights[st.peek()] >= heights[i]) st.pop();
            res[i]= st.peek();
            st.push(i);
        }
        
        return res;
    }
    private int[] prevSmallest(int[] heights, int n){
        int res[]= new int[n];
        Stack<Integer> st= new Stack<>();
        st.push(-1);
        for(int i= 0; i<n; i++){
            while(st.peek()!=-1 && heights[st.peek()] >= heights[i]) st.pop();
            res[i]= st.peek();
            st.push(i);
        }
        
        return res;
    }
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        int[] next= nextSmallest(heights,n);
        int[] prev= prevSmallest(heights,n);
        
        int res= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int l= heights[i];
            if(next[i]==-1) next[i]=n;
            int b= next[i]-prev[i]-1;
            res= Math.max(res,l*b);
        }
        return res;
        
    }
}