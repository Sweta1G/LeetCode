class Solution {
    public int countPalindromicSubsequence(String s) {
        final int n = s.length();
    //mid, side
    final boolean[][] isPalindromic = new boolean[26][26];
    final int[] leftCount = new int[26];
    final int[] rightCount = new int[26];
    for(int i = 1; i < n; i++) {
        final int index = s.charAt(i) - 'a';
        rightCount[index]++;
    }
    leftCount[s.charAt(0) - 'a']++;
    for(int i = 1; i < n - 1; i ++) {
        final int index = s.charAt(i) - 'a';
        rightCount[index]--;
        for(int j = 0; j < 26; j++) {
            if(leftCount[j] > 0 && rightCount[j] > 0) {
                isPalindromic[index][j] = true;
            }
        }
        leftCount[index]++;
    }
    int result = 0;
    for(boolean[] e1 : isPalindromic) {
        for(boolean e2: e1) {
            if(e2) result++;
        }
    }
    return result;
    }
}