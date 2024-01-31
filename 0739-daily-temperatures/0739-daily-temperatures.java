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
    }
}
