class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i; // Track the last index of character presence.
        }

        boolean[] seen = new boolean[26]; // Keep track of seen characters.
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            int currentChar = s.charAt(i) - 'a';
            if (seen[currentChar]) continue; // If seen, skip it as we can pick only one character.
            
            // Pop characters from the stack that are greater than the current character and have remaining occurrences in the string.
            while (!stack.isEmpty() && stack.peek() > currentChar && i < lastIndex[stack.peek()]) {
                seen[stack.pop()] = false; // Mark them as unseen and remove from the stack.
            }
            
            stack.push(currentChar); // Add the current character into the stack.
            seen[currentChar] = true; // Mark it as seen.
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append((char) (stack.pop() + 'a'));
        }
        
        return result.reverse().toString(); // Reverse the stack to get the smallest lexicographical result.
    }
}