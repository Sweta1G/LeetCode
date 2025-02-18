class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        StringBuilder ans= new StringBuilder();
        
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='I'){
                while(!st.isEmpty())
                    ans.append(st.pop());
            }
            st.push(i+2);
        }
        while(!st.isEmpty()) ans.append(st.pop());
        return ans.toString();
    }
}