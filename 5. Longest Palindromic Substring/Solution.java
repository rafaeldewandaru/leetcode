class Solution {
    public String longestPalindrome(String s) {
        int size = s.length();
        boolean[][] palindrome = new boolean[size][size];

        int start = 0;
        int max = 1;

        // Mark single chars and 2 equal chars as palindrome
        for (int i = 0; i < size; i++) {
            palindrome[i][i] = true;
            if (i < size-1) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    palindrome[i][i+1] = true;
                    if (max < 2) {
                        start = i;
                        max = 2;
                    }
                }
            }
        }

        // Check other substring
        for (int h = 3; h <= size; h++) {
            for (int i = 0; i < size-h + 1; i++) {
                int j = i+h-1;

                if (palindrome[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    palindrome[i][j] = true;

                    if (h > max) {
                        start = i;
                        max = h;
                    }
                }
            }
        }

        return s.substring(start, start + max);
    }
}