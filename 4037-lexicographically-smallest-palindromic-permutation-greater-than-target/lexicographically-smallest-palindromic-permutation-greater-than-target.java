import java.util.Arrays;

class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int oddCount = 0;
        char midChar = 0;
        int[] halfFreq = new int[26];

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                midChar = (char) ('a' + i);
            }
            halfFreq[i] = freq[i] / 2;
        }

        if (oddCount > 1) {
            return "";
        }

        int m = n / 2;
        String bestAns = null;
        for (int i = m; i >= 0; i--) {
            int[] currentHalf = halfFreq.clone();
            boolean validPrefix = true;
            char[] prefix = new char[m];
            for (int k = 0; k < i; k++) {
                char tChar = target.charAt(k);
                if (currentHalf[tChar - 'a'] > 0) {
                    prefix[k] = tChar;
                    currentHalf[tChar - 'a']--;
                } else {
                    validPrefix = false;
                    break;
                }
            }

            if (!validPrefix) continue;
            if (i < m) {
                char targetChar = target.charAt(i);
                for (int c = targetChar - 'a' + 1; c < 26; c++) {
                    if (currentHalf[c] > 0) {
                        char[] tempPrefix = prefix.clone();
                        int[] tempHalf = currentHalf.clone();

                        tempPrefix[i] = (char) ('a' + c);
                        tempHalf[c]--;
                        int idx = i + 1;
                        for (int charIdx = 0; charIdx < 26; charIdx++) {
                            while (tempHalf[charIdx] > 0) {
                                tempPrefix[idx++] = (char) ('a' + charIdx);
                                tempHalf[charIdx]--;
                            }
                        }
                        String cand = buildPalindrome(tempPrefix, midChar, n);
                        if (cand.compareTo(target) > 0) {
                            if (bestAns == null || cand.compareTo(bestAns) < 0) {
                                bestAns = cand;
                            }
                        }
                    }
                }
            } 
            else {
                String cand = buildPalindrome(prefix, midChar, n);
                if (cand.compareTo(target) > 0) {
                    if (bestAns == null || cand.compareTo(bestAns) < 0) {
                        bestAns = cand;
                    }
                }
            }
        }

        return bestAns == null ? "" : bestAns;
    }

    private String buildPalindrome(char[] firstHalf, char midChar, int totalLen) {
        StringBuilder sb = new StringBuilder();
        sb.append(firstHalf);
        if (totalLen % 2 != 0) {
            sb.append(midChar);
        }
        for (int i = firstHalf.length - 1; i >= 0; i--) {
            sb.append(firstHalf[i]);
        }
        return sb.toString();
    }
}