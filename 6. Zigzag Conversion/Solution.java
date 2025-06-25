class Solution {
    public String convert(String s, int numRows) {
        char[][] zigzag = new char[numRows][s.length()];
        
        int curr = 0;
        int i = 0;

        while (curr < s.length()) {
            for (int j = 0; j < numRows; j++) {
                zigzag[j][i] = s.charAt(curr);
                curr++;

                if (curr == s.length()) {
                    break;
                }
            }

            if (curr == s.length()) {
                    break;
                }

            i++;

            for (int k = numRows-2; k > 0; k--) {
                zigzag[k][i] = s.charAt(curr);
                curr++;
                i++;

                if (curr == s.length()) {
                    break;
                }
            }
        }

        String result = "";
        for (char[] row:zigzag) {
            for (char ele:row) {
                if (ele != '\u0000') result += ele;
            }
        }

        return result;
    }
}