class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder();

        // Iterate through each binary string in the array
        for (int i = 0; i < nums.length; ++i) {
            // Access the i-th character of the i-th binary string
            char currentCharacter = nums[i].charAt(i);

            // Append the opposite binary value to the result string
            result.append((currentCharacter == '0' ? '1' : '0'));
        }

        // Return the resulting binary string
        return result.toString();
    }
}