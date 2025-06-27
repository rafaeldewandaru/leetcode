class Solution {
    public int myAtoi(String s) {
        String result = "";
        boolean isNegative = false;
        for (int i = 0; i < s.length(); i++) {
            if (isDigit(s.charAt(i))) {
                result += s.charAt(i);
            }

            else {
                if (result.equals("") && s.charAt(i) == ' ') {
                    continue;
                }

                if (result.equals("") && ((s.charAt(i) == '-') || s.charAt(i) == '+')) {
                    result += s.charAt(i);
                    if (s.charAt(i) == '-') {
                        isNegative = true;
                    }
                }

                else {
                    break;
                }
            }
        }

        try {
            if (result.equals("") || result.equals(String.valueOf('-')) || result.equals(String.valueOf('+'))) {
                return 0;
            }
            return Integer.parseInt(result);

        } catch (NumberFormatException e) {
            if (isNegative) {
                return Integer.MIN_VALUE;
            }

            return Integer.MAX_VALUE;

        } catch (Exception e) {
            return 0;
        }
        
    }

    public boolean isDigit(char c) {
        try {
            int num = Integer.parseInt(String.valueOf(c));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}