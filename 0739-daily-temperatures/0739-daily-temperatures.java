class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int[] ans = new int[temperatures.length];
        for (int i=0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int a = stack.pop();
                ans[a] = i-a;
            }
            stack.push(i);
        }
        return ans;
        
        
//         int ans[]= new int[temp.length], l=0;
        
//         for(int i=0; i<temp.length; i++){
            
//             int c=1, today= temp[i];
//             for(int j=i+1; j<temp.length; j++){
//                 if(today<temp[j]) {
//                     ans[l++]= c;
//                     break;
//                 }
//                 if(j==temp.length-1) ans[l++]=0;
//                 else c++;
//             }
//         }
//         return ans;
    }
}
