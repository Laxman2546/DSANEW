class Solution {
    public int minInsertions(String s) {
        int openCount = 0;
        int insertions = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openCount += 1;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    insertions++;
                }
                if (openCount > 0) {
                    openCount--;
                } else {
                    insertions++;
                }
            }
        }
        insertions += openCount * 2;

        return insertions;
    }
}