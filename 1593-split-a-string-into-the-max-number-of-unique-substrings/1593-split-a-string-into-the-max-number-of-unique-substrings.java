class Solution {
    private Set<String> set;
    private int maxCnt;

    private void rec(int i, int cnt, String s) {
        if (cnt + (s.length() - i) <= maxCnt) return;
        if (i == s.length()) {
            maxCnt = Math.max(maxCnt, cnt);
            return;
        }

        String substr = "";
        for (int j = i + 1; j <= s.length(); j++) {
            substr = s.substring(i, j);
            if (!set.contains(substr)) {
                set.add(substr);
                rec(j, cnt + 1, s);
                set.remove(substr);  // Backtrack
            }
        }
    }

    public int maxUniqueSplit(String s) {
        set = new HashSet<>();
        maxCnt = 0;
        rec(0, 0, s);
        return maxCnt;
    }
}