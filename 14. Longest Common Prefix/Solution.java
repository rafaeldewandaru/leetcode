class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        boolean loop = true;

        for (int i = 0; i < strs[0].length(); i++) {
            Character pos = strs[0].charAt(i);
            try {
                for (String str: strs) {
                    loop = loop && str.charAt(i) == pos;
                }

                if (loop) {
                    index++;
                }
                
            } catch (Exception e) {
                break;
            }
        }

        return index == 0 ? "" : strs[0].substring(0, index);
    }
}