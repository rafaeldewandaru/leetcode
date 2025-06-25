class Solution {
    public int reverse(int x) {

        String s = String.valueOf(x);

        String result = "";

        for (int i = s.length()-1; i > -1; i--) {
            if (result.equals("") && s.charAt(i) == '0') {
                continue;
            }

            if (s.charAt(i) == '-') {
                result = "-" + result;
            }

            else {
                result += s.charAt(i);
            }
        }

        try {
            return Integer.parseInt(result);
        } catch (Exception e) {
            return 0;
        }
        
    }
}